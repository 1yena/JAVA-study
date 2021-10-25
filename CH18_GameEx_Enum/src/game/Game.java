package game;

import java.util.Random;
import java.util.Scanner;

import game.Objects.*;

public class Game {
	
	//����, ����, ��
	
	private Random random = new Random();	 //�������� �ϳ� ����
	private Scanner scanner = new Scanner(System.in);

	public void run() {
		
		System.out.println("�＼�� ������ �����մϴ�.");
		int wins = 0;
		
		for (int i = 1; i <= 3; i++) {
			System.out.println(i+ "��° ���� ����...");
		
		//���� ����
		System.out.print("��(0), ��(1), ��(2) �� ���ڸ� ���� : ");
	
		GameObject[] objects = GameObject.values();
		GameObject ob1 = objects[scanner.nextInt()];
		GameObject ob2 = objects[random.nextInt(objects.length)];
		
		System.out.println("����� ������ : "+ ob1 );
		System.out.println("��ǻ�� ������ : "+ ob2 );
		
		int score = ob1.compare(ob2);
		wins = wins+score;
		
		}
		
		if (wins > 0) {
			System.out.println("���� �¸�!");
		} else if (wins < 0) {
			System.out.println("���� �й�!");
		} else {
			System.out.println("���!");
		}
		
		scanner.close();
		
	}

}
