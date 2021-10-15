package application;

import java.util.Scanner;

public class Hangman {
	
	private boolean running = true;
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	
	public void run() {
		// ���ӽ���
		
		do {
			displayWord(); // 1. ȭ�鿡 �ܾ� ǥ��
			getUserInput(); // 2. ö�� �Է� ����
			checkUserInput(); // 3. ö�ڰ� �´��� üũ (�� ������ ����)
			
		} while (running);
		
	}

	private void checkUserInput() {
		//System.out.println("üũ");
	}

	private void getUserInput() {
		//�������� �� ���� �Է� �䱸
		//�Է� ���� ���ڿ����� �� ���ڸ� �̾Ƽ� RandomWord ��ü�� ����. => addGuess(����) �޼ҵ� �����.
		
		System.out.print("�� ���� �Է� : ");
		String guess = scanner.nextLine();
		word.addGuess(guess.charAt(0));
		
		
	}

	private void displayWord() {
		// ���� �ܾ� ���
		System.out.println(word.toString());
	}

	

}
