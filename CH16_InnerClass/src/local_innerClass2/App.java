package local_innerClass2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	
	private String name;
	
	public App() {
		// 기본 생성자
		name = "엘리자";
	}
	
	public String getName() {
		return name;
	}

	
	private void run() {
		
//		class Printer implements Runnable { 
//			@Override
//			public void run() {	// 추상메소드를 완성한다.
//				System.out.println(name);	// 타이머로 반복할 코드.
//				
//			}
//			
//		}
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		}, 0, 1, TimeUnit.SECONDS);
		
	}

	
	public static void main(String[] args) {
		// 메소드 안의 클래스
		// System.out.println(name); 이렇겐 사용 안 됨. 
		
		App app = new App();
		app.run();

	}
	

}
