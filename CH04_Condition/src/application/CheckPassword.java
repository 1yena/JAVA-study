package application;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		// �Է��� �н����尡 ������ �н������ ������ ���Ѵ�.
		final String user_password = "����";
		
		System.out.print("������ ������ ? > ");
		
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		scanner.close();
		
		if(password.equals(user_password)) {
			System.out.println("���� ����.");
		}
		else {
			System.out.println("�ʴ� �� ��������.");
		}
				
				
	}

}
