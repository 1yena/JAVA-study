package application;

import java.util.Scanner;

public class Scope {

	public static void main(String[] args) {
		// ������ ������ �ڵ���{}���� ����.
		{
			int value = 0;
			System.out.println(value);
		}
		// System.out.println(value); ���� �ڵ��� �ۿ��� ���Ұ�.
		
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.println(i);
		}

		String input = "";
		
		do {
		
			System.out.println("�����ҷ��� '���縸��'�� �Է��ϼ���.");
			input = scanner.nextLine();		
			
		} while(!input.equals("���縸��"));
		
		scanner.close();
		
	}

}












