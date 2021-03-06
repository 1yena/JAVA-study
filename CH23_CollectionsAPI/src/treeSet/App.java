package treeSet;

import java.util.TreeSet;

class Person implements Comparable<Person> { // 커스텀클래스 생성
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {	// 이게 출력되는 거임.
		return name;
	}

	@Override
	public int compareTo(Person other) {
		// tree셋이 정렬을 할 수 있도록 비교방법을 코드로 작성한다.
		return this.name.compareTo(other.name);
	}
}

public class App {
	public static void main(String[] args) {
		// 트리셋은 정렬 기능이 추가됨.
		
		TreeSet<Person> people = new TreeSet<>();
		
		people.add(new Person("펭수"));
		people.add(new Person("라이언"));
		people.add(new Person("가가멜"));
		people.add(new Person("스머프"));
		
		for(Person p : people) {
			System.out.println(p);
		}
		
		System.out.println("===================");
		
		TreeSet<Integer> numbers = new TreeSet<>(); // 연습
		
		numbers.add(8);
		numbers.add(1);
		numbers.add(7);
		numbers.add(3);
		
		for(Integer n : numbers) {
			System.out.println(n);
		}

	}

}
