package multi_Inheritance;

public class App {

	public static void main(String[] args) {

		Person p1= new Person();
		p1.greet();
		p1.speak();
		
		Speaker p2 = new Person();
		p2.speak();
		// p2.greet(); speak 인터페이스에 greet 메소드 없음.
		
		Greeter p3 = new Person();
		p3.greet();
		// p3.speak(); greet 인터페이스에 speak 메소드 없음.

	}

}
