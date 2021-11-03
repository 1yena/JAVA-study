package lambda_parameter2;

interface Runner {
	void execute(String name, String text);
}

public class App {

	public static void main(String[] args) {
		// 파라메터(매개변수) 있는 추상메소드
		Runner run = (n, t) -> System.out.printf("%s님 %s \n", n, t);
		Runner run1 = (n, t) -> System.out.printf("%s %s님 \n", t, n);
		run.execute("펭수", "안녕하세요");
		System.out.println("================1");
		run1.execute("콜리", "안녕");
		System.out.println("================2");
		
		// 메소드로 사용
		greet(run);
		greet(run1);

	}

	private static void greet(Runner run) {
		run.execute("길동", "반갑다!");
		System.out.println("================");
		
	}

}
