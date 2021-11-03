package example;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

	public static void greet() { 
		System.out.println("헬로");

	}
	
	public static void main(String[] args) {
		// 메소드 레퍼런스 람다식 대체
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		
//		// 람다식
//		service.scheduleAtFixedRate( () -> System.out.println("헬로"), 0, 1000, TimeUnit.MILLISECONDS);
		
		service.scheduleAtFixedRate(App::greet, 0, 1000, TimeUnit.MILLISECONDS);
								//  클래스이름::메소드이름 (매개변수는 X).
		
		
		
	}

}
