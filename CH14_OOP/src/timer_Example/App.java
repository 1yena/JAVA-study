package timer_Example;

import java.util.Timer;
import java.util.TimerTask;

// 하나의 파일에 여러개의 클래스를 만들 수 있다. 그러나 public class는 단 하나이고 파일의 이름과 같다.
class Task extends TimerTask {

	@Override
	public void run() {
		System.out.println("헬로");
		
	}
	
}


public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 3000); 	// 할일:run(), 실행시간:0초, 반복시간:3초

	}

}
