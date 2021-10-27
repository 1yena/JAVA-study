package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// 
		
		final String user_pass = "고구마";
		
		Scanner scanner = new Scanner(System.in);
		
		boolean accessOK = false;
		
		String password = "";
		
		for(int i = 1; i <= 3; i++) {
			System.out.print("호박 ? > ");
			password = scanner.nextLine();
			
			if(password.equals(user_pass)) {
				System.out.println("접속 승인.");
				accessOK = true;
				break;
			} 
			else {
				System.out.println("아냐.");
			}
		}
		
		
		scanner.close();
		
		if(!accessOK) {
			System.out.println("접속거부");
		}

	}

}










