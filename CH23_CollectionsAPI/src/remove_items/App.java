package remove_items;

import java.util.ArrayList;
import java.util.List;

class Cat {
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}	
}

public class App {

	public static void main(String[] args) {
		// 리스트의 아이템을 제거.
		
		Cat c1 = new Cat("마틸다");
		
		List<Cat> cats = new ArrayList<>();
		cats.add(c1);
		cats.add(new Cat("라이언"));
		cats.add(new Cat("마이클"));
		cats.add(new Cat("제니"));
		
		cats.forEach(System.out::println);
		
		System.out.println("===========================1");
		
		cats.remove(1);		// 인덱스 1번 라이언 삭제.
		
		cats.forEach(System.out::println);	
		
		System.out.println("===========================2");
		
		cats.remove(c1);	// c1 마틸다 객체 주소를 삭제.
		
		cats.forEach(System.out::println);	
		
		System.out.println("===========================3");
		
		System.out.println(cats);
		
		
		
	}

}
