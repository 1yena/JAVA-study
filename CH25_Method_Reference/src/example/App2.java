package example;


@FunctionalInterface
interface Greeter {
	void greet();
}

public class App2 {
	public static void main(String[] args) {		
		// 람다식을 메소드로 대체
		Greeter g = App2::sayHello;
		
		g.greet();	
	}
	
	// 람다식을 메소드 레퍼런스로 대체
	private static void sayHello() {
		System.out.println("반갑!");
	}

}
