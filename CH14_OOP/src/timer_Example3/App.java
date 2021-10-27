package timer_Example3;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;



class Alert extends TimerTask {

	@Override
	public void run() {
		System.out.println("헬로");
		
	}
	
}

class Task implements Runnable {
	@Override
	public void run() {
		System.out.println("배고파 !");
	}
}

public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert(), 0, 2500);
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task(), 0, 3, TimeUnit.SECONDS);

	}

}
