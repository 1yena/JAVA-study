package reading_lineByline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// 파일의 절대경로를 문자열로 표시(\\(2개)로 표시됨).
		String fileLocation = "C:\\JAVA\\JAVA-study\\CH21_Reading_Writing\\text.txt";
				
		System.out.println(new File(fileLocation).exists());	// 파일이 있으면 true 없으면 false로 리턴함.
		System.out.println();
				
		// 파일을 한 줄씩 읽을 수 있는 클래스
		try(BufferedReader reader = new BufferedReader(new FileReader(fileLocation))) {
			
			String line = null;
			while((line = reader.readLine()) != null) {	// 파일을 한 줄씩 읽다가 마지막 글을 읽고 나면 종료.
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// 파일이 파일주소에 없을 때
			System.out.println("파일을 찾지 못 함 : " + fileLocation);
		} catch (IOException e) {
			// 파일을 읽지 못 함.
			System.out.println("파일을 읽지 못 함 : " + fileLocation);
		} 
				
	}

}
