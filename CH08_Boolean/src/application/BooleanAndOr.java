package application;

public class BooleanAndOr {

	public static void main(String[] args) {
		// and, or ���ÿ� ���.
		
		boolean isRaining = false; 		// �� ���°�?
		boolean mightRain = false; 		// �� �� ���� �ִ°�?
		boolean haveUmbrella = true;	// ����� �ִ°�?
		
		if((isRaining || mightRain) && (haveUmbrella)) {
			System.out.println("����� ����!");
		}
		else {
			System.out.println("����� ���� �ʴ´�.");
		}
		
		boolean rainCheck = isRaining || mightRain;
		
		if(rainCheck && haveUmbrella) {
			System.out.println("����� ����!");
		}
		else {
			System.out.println("����� ���� �ʴ´�.");
		}

	}

}
