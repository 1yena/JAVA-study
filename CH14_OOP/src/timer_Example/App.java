package timer_Example;

import java.util.Timer;
import java.util.TimerTask;

// �ϳ��� ���Ͽ� �������� Ŭ������ ���� �� �ִ�. �׷��� public class�� �� �ϳ��̰� ������ �̸��� ����.
class Task extends TimerTask {

	@Override
	public void run() {
		System.out.println("���");
		
	}
	
}


public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 3000); 	// ����:run(), ����ð�:0��, �ݺ��ð�:3��

	}

}
