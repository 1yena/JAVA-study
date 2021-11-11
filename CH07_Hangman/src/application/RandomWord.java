package application;

import java.util.Random;

public class RandomWord {
	private String books = "decision transportation preference chocolate development contract marriage investment politics relation secretary suggestion conversation engineering chemistry software teaching introduction language platform";
	
	private String[] words = books.split(" "); //공백을 기준으로 잘라서 배열로 리턴한다.
	
	private String selectWord; 				   // 선택한 단어
	private Random rand = new Random();		   //랜던 객체를 생성
	private char[] characters;
	
	public RandomWord() {
		
		selectWord = words[rand.nextInt(words.length)]; //랜덤으로 단어를 선택.
		characters = new char[selectWord.length()]; 	//문자 배열 공간 생성.
		
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
				
				sb.append(c == '\u0000' ? '_' : c); // '\u0000' = 초기값(널값)
				sb.append(' ');
				
		}
		
//		System.out.println(selectWord); //육안으로 확인용.
		return sb.toString();
	}
	
	public void getWords() {
		
		for(String w : words) {
			System.out.println(w);
		}
		
	}

	public void addGuess(char c) {
		// 사용자가 입력한 한 문자를 선택된 단어에서 같은 게 있는지 확인.
		// 있으면 characters의 인덱스 위치에 입력.
		
		for(int i=0; i < selectWord.length(); i++) {
			if(c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
			
	}

	public boolean isCompleted() { // 다 맞췄는가 확인
		
		for(char c : characters) {
			
			if(c=='\u0000') {
				return false; // 아직 characters 배열에 못 맞춘 철자가 있을 경우
			} 
			
		}
		return true; //다 맞춤.
	}
	
}












