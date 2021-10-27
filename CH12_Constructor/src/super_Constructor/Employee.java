package super_Constructor;

public class Employee extends Person {
	
	public Employee() {
		super("익명");
		//가 생략되어 있음==부모클래스(Person생성자)가 생략되어 있다
		// 따라서 Person 생성자를 먼저 실행되고 Employee(); 생성자가 실행됨.
		System.out.println("emp 생성자");
	}

}
