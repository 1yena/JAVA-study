package timer_Example2;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {
	@Override
	public void run() {
		System.out.println("배고파 !");
	}
}


public class App {

	public static void main(String[] args) {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task(), 0, 3, TimeUnit.SECONDS); // 할일,딜레이시간(실행시간),반복시간,시간타입

	}

}
