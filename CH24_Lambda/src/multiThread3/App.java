package multiThread3;

public class App {
	private int value = 0;
	
	public void run() throws InterruptedException { 

		Runnable runnable = () -> {
			for(int i = 0; i < 1000; i++) {
				value++;
			}
		};
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		t1.start();
		t2.start();
		
		System.out.println("value: " + value);
		System.out.println("===============");
		
		t1.join();
		t2.join();
		
		System.out.println("value: " + value);
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		// App객체 생성해서 run메소드 실행.
		new App().run();
		
	}

}
