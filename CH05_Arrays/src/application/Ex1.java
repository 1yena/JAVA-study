package application;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// ���� 1
		
		Scanner scanner = new Scanner(System.in);
		
		final int num = 5; //�迭�� ũ��(�������� ����)
		
		int[] number = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("���ڸ� �Է� : ");
			number[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		int total = 0; // ������ ���� ����� ����
		
		for(int i=0; i<num; i++) {
			
			System.out.println(number[i]);
			total = total + number[i]; //�迭 �������� �ϳ��ϳ��� ���� ����.
					
		}

		System.out.println("�հ� : " + total);
		
	}

}
