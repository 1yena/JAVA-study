package application;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		// IF문
		Scanner scanner = new Scanner(System.in); // 스캐너 생성.
		
		System.out.print("사과의 개수는 ? ");
		
		int apples = scanner.nextInt();
		
		System.out.print("바나나의 개수는 ? ");
		
		int banana = scanner.nextInt();
		scanner.close(); // 스캐너 사용 후 닫기 -> 그래야 경고 표시가 없어짐.
		
		
		
		if(apples < banana) {
			System.out.println("바나나가 사과보다 많음.");
		}
		else if(apples > banana) {
			System.out.println("사과가 바나나보다 많음.");
		}
		else {
			System.out.println("개수가 같다.");
		} // 개수가 같을 경우
		
		
		
		System.out.println("프로그램 종료.");

	}

}
