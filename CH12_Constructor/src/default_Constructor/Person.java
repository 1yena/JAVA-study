package default_Constructor;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		System.out.println("����ġ�� ������!");
		name = "��";
		age = 0;
	}
	
	public Person(String name) {
		System.out.println("���̰� ������!");
		this.name = name;
		age = 0;
	}
	
	public Person(int age) {
		System.out.println("������ ������!");
		this.name = "��";
		this.age = age;
	}
	
	public Person(String name, int age) {
		System.out.println("����� ������!");
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name = " + name + ", age = " + age + "]";
	}
	
	
	
}
