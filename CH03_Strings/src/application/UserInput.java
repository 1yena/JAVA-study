package application;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// 입력을 받는 클래스 scanner를 이용한다.
		
		Scanner scanner = new Scanner(System.in); //스캐너를 사용할 수 있게 생성.
		System.out.print("온도를 입력해 주세요 : ");
		
		double c = scanner.nextDouble(); //스캐너 객체의 nextInt() 메소드를 정수값을 입력.
		double f = (c * 9/5) + 32; //화씨
		
		System.out.println("섭씨 " +c+ "도는 화씨 "+f+"도이다.");
		
		scanner.close();
		
	}

}
