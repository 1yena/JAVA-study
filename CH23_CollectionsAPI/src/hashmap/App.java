package hashmap;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		// 헤시맵은 순서*인덱스)가 없고 키값으로 인덱스 대체
		HashMap<Integer, String> people = new HashMap<>();
		
		//맵은 입력 시 값이 2개(key, value)이기 때문에 'add'가 아니라 'put'을 사용한ㄷ.
		people.put(0, "펭수");
		people.put(1, "길동");
		people.put(3, "라이언");
		people.put(4, "프레드");
		people.put(4, "마이클");	// 4번 키의 value값을 "마이클"로 덮어씀.
		people.put(10, "수지");
		
		// 람다식 출력
		people.forEach((k, v) -> {
			System.out.println(k + " : " + v);
		});
		
		System.out.println("===============================1");
		// 키값에 해당하는 값을 가져오기.
		System.out.println(people.get(4));
		
		System.out.println("===============================2");
		
		String person = people.get(10);
		System.out.println(person);
		
		System.out.println("===============================3");
		
		
	}

}
