package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_WordSet {

	public static void main(String[] args) throws IOException {
		// 책파일을 불러와서 단어로 정렬 출력
		
		File wordsaaa = new File("aaa.txt");
		File wordsbbb = new File("bbb.txt");
		
		System.out.println(wordsaaa.exists());	// 파일이 존재하면 참.
		System.out.println(wordsbbb.exists());	// 파일이 존재하면 참.
		
		TreeSet<String> aaa = loadWords(wordsaaa);
		TreeSet<String> bbb = loadWords(wordsbbb);
		
		System.out.println(aaa.size());	// 단어 수
		System.out.println(bbb.size()); // 단어 수
		
		System.out.println("=======================");
		
		displayWords(aaa);

	}

	private static void displayWords(TreeSet<String> list) {
		// 트리셋을 입력받아 그 안의 단어들을 출력한다.
		
		int count = 0;
		
		for(String w : list) {
			if(w.length() >= 6) {
				System.out.printf("%-15s \t", w); // 자릿수는 15자리고 왼쪽 정렬, 탭만큼 띄움.
				
				count ++;
				if(count == 6) {	// 한 줄에 6단어씩 출력.
					System.out.println();
					count = 0;
				}
			}
		}
		
	}

	private static TreeSet<String> loadWords(File file) throws IOException {
		// 파일을 입력하면 파일을 읽어서 단어들을 TreeSet으로 리턴한다.
		
		TreeSet<String> wordSet = new TreeSet<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line = null;
			
			while ((line = br.readLine()) != null) { // 파일을 한 줄씩 읽다가 마지막글을 읽고 나면 종료
				String[] words = line.split("[^a-zA-Z]+");	// 영문 단어 배열로 리턴한다.
				
				for(String w : words) {
					if(w.length() < 2 )	continue;	 // 단어가 철자1이하는 제외
					wordSet.add(w.toLowerCase());	 // 단어들을 소문자로 리스트에 추가.
				}
			}	
		}
		return wordSet;
	}

}
