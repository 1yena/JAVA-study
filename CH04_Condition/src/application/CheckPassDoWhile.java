package application;

import java.util.Scanner;

public class CheckPassDoWhile {

	public static void main(String[] args) {
		// �н����带 �Է¹޾� do while������ �´��� �˻��Ѵ�.
		// �н����尡 ���� ������ �ݺ���.
		
		Scanner scanner = new Scanner(System.in);
		
		final String pass = "ī��";
		
		String password = null;
		
		do {
			
			System.out.print("���� �� ġ�� ? > ");
			password = scanner.nextLine();
			
		} while (!password.equals(pass)); // "!"�� �ݴ�. => �����̸� �ݺ���.
		
		scanner.close();
		
		System.out.println("���� ����.");
		
		
	}
		
}
