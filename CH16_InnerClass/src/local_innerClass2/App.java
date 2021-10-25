package local_innerClass2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	
	private String name;
	
	public App() {
		// �⺻ ������
		name = "������";
	}
	
	public String getName() {
		return name;
	}

	
	private void run() {
		
//		class Printer implements Runnable { 
//			@Override
//			public void run() {	// �߻�޼ҵ带 �ϼ��Ѵ�.
//				System.out.println(name);	// Ÿ�̸ӷ� �ݺ��� �ڵ�.
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
		// �޼ҵ� ���� Ŭ����
		// System.out.println(name); �̷��� ��� �� ��. 
		
		App app = new App();
		app.run();

	}
	

}
