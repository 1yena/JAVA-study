package multi_Inheritance;

public class Person implements Speaker, Greeter {
	// 인터페이스는 다중(여러개)구현이 가능하지만 상속(extends)은 하나만 된다.

	@Override
	public void greet() {
		System.out.println("환영합니다!");
		
	}

	@Override
	public void speak() {
		System.out.println("나는 Person입니다.");
		
	}

}
