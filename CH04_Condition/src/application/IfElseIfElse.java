package application;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		// IF��
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ����.
		
		System.out.print("����� ������ ? ");
		
		int apples = scanner.nextInt();
		
		System.out.print("�ٳ����� ������ ? ");
		
		int banana = scanner.nextInt();
		scanner.close(); // ��ĳ�� ��� �� �ݱ� -> �׷��� ��� ǥ�ð� ������.
		
		
		
		if(apples < banana) {
			System.out.println("�ٳ����� ������� ����.");
		}
		else if(apples > banana) {
			System.out.println("����� �ٳ������� ����.");
		}
		else {
			System.out.println("������ ����.");
		} // ������ ���� ���
		
		
		
		System.out.println("���α׷� ����.");

	}

}
