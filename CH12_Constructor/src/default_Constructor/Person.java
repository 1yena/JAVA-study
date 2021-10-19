package default_Constructor;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		System.out.println("세발치가 생성됨!");
		name = "모름";
		age = 0;
	}
	
	public Person(String name) {
		System.out.println("궁이가 생성됨!");
		this.name = name;
		age = 0;
	}
	
	public Person(int age) {
		System.out.println("오구가 생성됨!");
		this.name = "모름";
		this.age = age;
	}
	
	public Person(String name, int age) {
		System.out.println("사람이 생성됨!");
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name = " + name + ", age = " + age + "]";
	}
	
	
	
}
