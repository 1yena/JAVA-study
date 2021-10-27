package interface_Inheritance;

public class Machine implements DefaultRunnable {

	@Override
	public void run() { // 'Runnable'에서 가져옴
		System.out.println("머신 러닝!");
		
	}

}
