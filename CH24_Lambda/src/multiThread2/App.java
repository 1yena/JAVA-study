package multiThread2;

public class App {
	private int value = 0;
	
	private synchronized void increment() {
		value++;
	}
	
	public void run() throws InterruptedException { 
		// synchronized로 한 쓰레드가 사용중에 다른 쓰레드가 사용 못 함.
		Runnable runnable = () -> {
			for(int i = 0; i < 10000; i++) {
				increment();
			}
		};
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("value: " + value);
		System.out.println("===============");
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("value: " + value);
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		// App객체 생성해서 run메소드 실행.
		new App().run();
		
	}

}
