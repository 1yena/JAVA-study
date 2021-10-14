package application;

// 클래스 생성.
class Person {
	String name;
}

public class ClassObject {

	public static void main(String[] args) {
		// 클래스 설계도로 실제 사용가능한 객체를 생성함(메모리에 생성)
		
		Person p1 = new Person(); // 실제 객체를 생성한다. ("new x();")
		p1.name = "펭수";

		Person p2 = new Person(); // 실제 객체를 생성한다. ("new x();")
		p2.name = "길동";
		
		System.out.println(p1.name);
		System.out.println(p2.name);

	}

}






