package application;

import java.util.Scanner;

public class Hangman {
	
	private boolean running = true;
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	
	public void run() {
		// ���ӽ���
		
		do {
			
			displayWord(); 		// 1. ȭ�鿡 �ܾ� ǥ��
			getUserInput(); 	// 2. ö�� �Է� ����
			checkUserInput(); 	// 3. �´��� üũ �� ������ running = false
			
		} while (running);
		
	}
	
	public void close() {
		//���� ����, ��ĳ�� �ݱ�.
		scanner.close();
	}

	private void checkUserInput() {
		//������ ö�ڸ� �� ������� üũ�ؼ� ������ ����. (running = false)
		//�������� Ȯ���ϴ� �޼ҵ� isCompleted(ö�ڰ� �� �´��� üũ�ϴ� �޼ҵ�) �����.
		
		if(word.isCompleted() ) {
			
			System.out.println("�� ������ !");
			System.out.println("������ : " + word.toString());
			running = false; // �ݺ��� ����(��������)
			
		}
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
