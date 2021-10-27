package application;

import java.util.Scanner;

public class Hangman {
	
	private boolean running = true;
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	
	public void run() {
		// 게임시작
		
		do {
			
			displayWord(); 		// 1. 화면에 단어 표시
			getUserInput(); 	// 2. 철자 입력 받음
			checkUserInput(); 	// 3. 맞는지 체크 다 맞으면 running = false
			
		} while (running);
		
	}
	
	public void close() {
		//게임 종료, 스캐너 닫기.
		scanner.close();
	}

	private void checkUserInput() {
		//유저가 철자를 다 맞췄는지 체크해서 게임을 종료. (running = false)
		//게임종료 확인하는 메소드 isCompleted(철자가 다 맞는지 체크하는 메소드) 만들기.
		
		if(word.isCompleted() ) {
			
			System.out.println("잘 맞췄어요 !");
			System.out.println("정답은 : " + word.toString());
			running = false; // 반복문 종료(게임종료)
			
		}
	}

	private void getUserInput() {
		//유저에게 한 문자 입력 요구
		//입력 받은 문자열에서 그 문자를 뽑아서 RandomWord 객체에 전달. => addGuess(문자) 메소드 만들기.
		
		System.out.print("한 문자 입력 : ");
		String guess = scanner.nextLine();
		word.addGuess(guess.charAt(0));
		
	}

	private void displayWord() {
		// 랜덤 단어 출력
		System.out.println(word.toString());
	}


}
