package numbering;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 10진수 : decimal 0-9
		 * 2진수  : binary 0,1 컴퓨터가 사용
		 * 16진수 : hexadecimal 0-9,A,B,C,D,E,F 2진수를 보기 좋게 표시(0-15까지)
		 * 예) 10진수:1234, 2진수:01001, 16진수:1B2F
		 */
		
		int value = 123;
		
		System.out.println(Integer.toBinaryString(value)+" :2진수");	// 2진수로 변환
		System.out.println(Integer.toBinaryString(123));
		System.out.println("============================================1");
		System.out.println(Integer.toHexString(value)+" :16진수");		// 16진수로 변환
		System.out.println("============================================2");
		
		int value255 = 0xFF;	// 0x는 16진수를 의미, 0b는 2진수
								// 0xFF = 10진수로 255임
		
		System.out.println(value255);
		System.out.println(Integer.toBinaryString(value255)+" :2진수");	// 2진수로 변환
		System.out.println(Integer.toHexString(value255)+" :16진수");		// 16진수로 변환
		
		

	}

}
