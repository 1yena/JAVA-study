package application;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		/* if(option == 1) {
			System.out.println("���");
		}
		else if(option == 2) {
			System.out.println("�ȳ�");
		}
		else if(option == 3) {
			System.out.println("���α׷� ����");
		} 
		else if(option == 10000) {
			System.out.println("�̽��Ϳ���");
		}
		else {
			System.out.println("�߸��� �ɼ��Դϴ�.");
		}  */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�޴�");
		System.out.println("====\n");
		System.out.println("1. ����Ʈ '���'");
		System.out.println("2. ����Ʈ '�ȳ�'");
		System.out.println("3. '���α׷� ����'");
		
		System.out.print("�ɼ��� ���� > ");
		int option = scanner.nextInt();
		scanner.close();
		
		switch (option) {
		case 1:
			System.out.println("���");
			break;
			
		case 2:
			System.out.println("�ȳ� ?");
			break;

		case 3:
			System.out.println("���α׷� ����...");
			break;
			
		case 10000:
			System.out.println("�̽��Ϳ���");
			break;
			
		default:
			System.out.println("�߸��� �ɼǹ�ȣ.");
			break;
		}

	}

}
