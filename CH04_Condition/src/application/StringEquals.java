package application;

public class StringEquals {
	
	public static void main(String[] args) {
		// ���ڿ��� ������ ���ؼ� ��, ������ �Ǻ�.
		
		String text1 = "apple";
		String text2 = "orange";
		String text3 = "orange";
		
		System.out.printf("�� ���� ���ڿ� ��ġ : %b\n", text1==text2);
		System.out.println("�� ���� ���ڿ� ��ġ : " + text1.equals(text2));
		
		System.out.printf("�� ���� ���ڿ� ��ġ : %b\n", text3==text2);
		System.out.println("�� ���� ���ڿ� ��ġ : " + text2.equals(text3));

		
	}
	
}
