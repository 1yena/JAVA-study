package file_class;

import java.io.File;

public class App {
	public static void main(String[] args) {
		File currntDirectory = new File("test");	// 점(.)은 현재 파일의 폴더 경로를 나타냄.
		
		System.out.println(currntDirectory.getAbsolutePath());	// 절대경로(현재 프로젝트폴더까지)
		
		// 폴더 안의 내부 파일들의 이름 출력
		for(String f : currntDirectory.list()) {
			System.out.println(f);
		}
		
	}

}
