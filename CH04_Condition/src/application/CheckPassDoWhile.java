package application;

import java.util.Scanner;

public class CheckPassDoWhile {

	public static void main(String[] args) {
		// �н����带 �Է¹޾� do while������ �´��� �˻��Ѵ�.
		// �н����尡 ���� ������ �ݺ���.
		
		Scanner scan = new Scanner(System.in);
		
		final String pass1 = "ī��";
		
		String password = null;
		
		do {
			
			System.out.print("���� �� ġ�� ? > ");
			password = scan.nextLine();
			
		} while (!password.equals(pass1)); // "!"�� �ݴ�. => �����̸� �ݺ���.
		
		scan.close();
		
		System.out.println("���� ����.");
		
		
	}
		
}
