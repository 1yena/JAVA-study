package yn;

import java.util.Scanner;

public class Yn1 {

	public static void main(String[] args) {
		// �ȳ��ϼ���
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�µ��� �Է����ּ��� : ");
		double c = scanner.nextInt();
		double f = (c * 9/5) + 32;
		
		System.out.println("���� " +c+"�� ȭ�� "+f+"���̴�.zzzz");
		
		scanner.close();
	}

}