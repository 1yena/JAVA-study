package application;

import java.util.Random;

public class RandomWord {
	private String books = "decision transportation preference chocolate development contract marriage investment politics relation secretary suggestion conversation engineering chemistry software teaching introduction language platform";
	
	private String[] words = books.split(" "); //������ �������� �߶� �迭�� �����Ѵ�.
	
	private String selectWord; 			// ������ �ܾ�
	private Random rand = new Random(); //���� ��ü�� ����
	private char[] characters;
	
	public RandomWord() {
		
		selectWord = words[rand.nextInt(words.length)]; //�������� �ܾ ����.
		characters = new char[selectWord.length()]; 	//���� �迭 ���� ����.
		
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : characters) {
			/*	
				if(c == '\u0000') {
				
					sb.append('_');
					
				}
				else {
				
					sb.append(c);
					
				} */
				
				sb.append(c == '\u0000' ? '_' : c); // '\u0000' = �ʱⰪ(�ΰ�)
				sb.append(' ');
				
		}
		
		// System.out.println(selectWord); �������� Ȯ�ο�.
		return sb.toString();
	}
	
	public void getWords() {
		
		for(String w : words) {
			System.out.println(w);
		}
		
	}

	public void addGuess(char c) {
		// ����ڰ� �Է��� �� ���ڸ� ���õ� �ܾ�� ���� �� �ִ��� Ȯ��.
		// ������ characters�� �ε��� ��ġ�� �Է�.
		
		for(int i=0; i < selectWord.length(); i++) {
			if(c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
			
	}

	public boolean isCompleted() { // �� ����°� Ȯ��
		
		for(char c : characters) {
			
			if(c=='\u0000') {
				return false; // ���� characters �迭�� �� ���� ö�ڰ� ���� ���
			} 
			
		}
		return true; //�� ����.
	}
	
}












