package innerClass;

public class App implements Runnable {
	private String name = "미키마우스";

	public static void main(String[] args) {
		new App().start();

	}

	private void start() {
		// activate 메소드 실행 방법.
		// 1번 : App 클래스에 Runnable 구현
		activate(this);
		
		// 2번 : 익명z클래스
		activate(new Runnable() {
			public void run() {
				System.out.println(name);	
			}
		});
		
		// 3번 : 이너클래스
		class Runner1 implements Runnable {
			public void run() {
				System.out.println(name);
			}
		}
		activate(new Runner1());
	}
	
	public void activate(Runnable runnable) {
		runnable.run();
	}

	@Override
	public void run() {
		System.out.println(name);
		
	}

}
