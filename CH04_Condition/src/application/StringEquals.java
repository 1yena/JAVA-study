package application;

public class StringEquals {
	
	public static void main(String[] args) {
		// 문자열이 같은지 비교해서 참, 거짓을 판별.
		
		String text1 = "apple";
		String text2 = "orange";
		String text3 = "orange";
		
		System.out.printf("두 개의 문자열 일치 : %b\n", text1==text2);
		System.out.println("두 개의 문자열 일치 : " + text1.equals(text2));
		
		System.out.printf("두 개의 문자열 일치 : %b\n", text3==text2);
		System.out.println("두 개의 문자열 일치 : " + text2.equals(text3));

		
	}
	
}
