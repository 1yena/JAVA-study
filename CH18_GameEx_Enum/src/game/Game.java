package game;

import java.util.Random;
import java.util.Scanner;

import game.Objects.*;

public class Game {
	
	//가위, 바위, 보
	
	private Random random = new Random();	 //랜던으로 하나 선택
	private Scanner scanner = new Scanner(System.in);

	public void run() {
		
		System.out.println("삼세판 게임을 시작합니다.");
		int wins = 0;
		
		for (int i = 1; i <= 3; i++) {
			System.out.println(i+ "번째 게임 시작...");
		
		//유저 선택
		System.out.print("찌(0), 묵(1), 빠(2) 중 숫자를 선택 : ");
	
		GameObject[] objects = GameObject.values();
		GameObject ob1 = objects[scanner.nextInt()];
		GameObject ob2 = objects[random.nextInt(objects.length)];
		
		System.out.println("당신의 선택은 : "+ ob1 );
		System.out.println("컴퓨터 선택은 : "+ ob2 );
		
		int score = ob1.compare(ob2);
		wins = wins+score;
		
		}
		
		if (wins > 0) {
			System.out.println("나의 승리!");
		} else if (wins < 0) {
			System.out.println("나의 패배!");
		} else {
			System.out.println("비김!");
		}
		
		scanner.close();
		
	}

}
