package application;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		// 입력한 패스워드가 지정된 패스워드와 같은지 비교한다.
		final String user_password = "앙팡";
		
		System.out.print("우유가 아프면 ? > ");
		
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		scanner.close();
		
		if(password.equals(user_password)) {
			System.out.println("접속 승인.");
		}
		else {
			System.out.println("너는 못 지나간다.");
		}
				
				
	}

}
