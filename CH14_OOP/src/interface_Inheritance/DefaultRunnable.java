package interface_Inheritance;

// 인터페이스에 인터페이스를 상속
public interface DefaultRunnable extends Runnable { //'Runnable'은 프로그램 자체에 있는 기본 인터페이스임. 'run'이라는 추상메소드를 기본으로 가지고 있음.
	default void dispalyDetails() { // default 메소드는 메소드 코드를 만들어줘야 함.
		System.out.println("표시할 디테일이란!");
		
	}

}
