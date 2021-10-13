package application;

public class Printf {

	public static void main(String[] args) {
		// printf("출력서식(%d(정수), %f(실수), %c(문자형식), %s(문자열))", 출력할값)
		int age = 25;
		String addr = "부산";
		double pi = 3.14592;
		
		
		System.out.printf("내 나이는 %d살입니다\n", age);
		System.out.printf("내 나이는 %d살이고 %s에 살고 있습니다\n", age, addr);
		System.out.printf("파이의 값은 %f", pi); 
		System.out.printf("파이의 값은 %.2f", pi); // %-f 사이에 [.x]값을 넣으면 소수점 위치 설정 가능.

	}

}
