package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// 
		
		final String user_pass = "����";
		
		Scanner scanner = new Scanner(System.in);
		
		boolean accessOK = false;
		
		String password = "";
		
		for(int i = 1; i <= 3; i++) {
			System.out.print("ȣ�� ? > ");
			password = scanner.nextLine();
			
			if(password.equals(user_pass)) {
				System.out.println("���� ����.");
				accessOK = true;
				break;
			} 
			else {
				System.out.println("�Ƴ�.");
			}
		}
		
		
		scanner.close();
		
		if(!accessOK) {
			System.out.println("���Ӱź�");
		}

	}

}










