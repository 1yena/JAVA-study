package example_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class App {

	public static void main(String[] args) {
		// key: Person 객체 / value: true, false(원격수업 여부)
		Map<Person, Boolean> people1 = new HashMap<>();
		Map<Person, Boolean> people2 = new LinkedHashMap<>();
		Map<Person, Boolean> people3 = new TreeMap<>();
		
		
		// map에서 키값으로 중복을 결정하는데 Person클래스에서 equals메소드를 이름으로 수정하면 이름이 같으면 중복이 된다.
		InputMap(people1);
		displayMap(people1);
		
		InputMap(people2);
		displayMap(people2);
		
		InputMap(people3);		// 트리맵은 정렬을 해야 하는데 키값인 person 객체가 비교할 수 있는 메소드가 없다.
		displayMap(people3);	// 따라서 Comparable 인터페이스 추가해야 함.
		
	}

	private static void displayMap(Map<Person, Boolean> map) {
		// map에 있는 key와 value 값을 출력
		map.forEach((k, v) -> System.out.println(k+" : "+v));
		System.out.println("==========================");
		
	}

	private static void InputMap(Map<Person, Boolean> map) {
		// map에 키와 값을 입력
		map.put(new Person("펭수"), true);
		map.put(new Person("길동"), true);
		map.put(new Person("라이언"), false);
		map.put(new Person("둘리"), false);
		map.put(new Person("라이언"), false);		// 중복이 되지 않는다.
		map.put(new Person("둘리"), true);		// 원격여부 업데이트
		
		
	}

}
