package application;

public class BooleanOr {

	public static void main(String[] args) {
		// ||(or) ��������
		
		boolean isRaining = true; 		// �� ���°�?
		boolean mightRain = false; 		// �� �� ���� �ִ°�?
		boolean takeUmbrella = false; 	// ����� ����?
		
		takeUmbrella = isRaining || mightRain; // �� ���ų� �Ǵ� �� ���� �ִ� ��� : �ϳ��� ���̸� ����� ��.
		
		System.out.println(takeUmbrella);

	}

}
