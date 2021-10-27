package application;

import java.util.Scanner;

public class CheckPassDoWhile {

	public static void main(String[] args) {
		// 패스워드를 입력받아 do while문으로 맞는지 검사한다.
		// 패스워드가 맞을 때까지 반복함.
		
		Scanner scan = new Scanner(System.in);
		
		final String pass1 = "카톡";
		
		String password = null;
		
		do {
			
			System.out.print("차를 톡 치면 ? > ");
			password = scan.nextLine();
			
		} while (!password.equals(pass1)); // "!"는 반대. => 거짓이면 반복함.
		
		scan.close();
		
		System.out.println("접속 승인.");
		
		
	}
		
}
