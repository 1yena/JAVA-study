package method;

public class Walking {

	public static void main(String[] args) {
		// 1. Į�θ� �褿���� ���� �޼ҵ带 ȣ���Ͻÿ�.
		// 2. ����� ����Ͻÿ�.
		
		double myCal = calori(800);
		System.out.println("�Ҹ�Į�θ� : " + myCal + " kcal");
	
	}
	
	// 2. Į�θ� ��� �޼ҵ带 �����Ͻÿ�.
	public static double calori(int walk) {
		double result = walk*0.02;
		return result;
		
	}
	
}






























