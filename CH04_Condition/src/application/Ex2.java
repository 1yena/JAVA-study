package application;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		/* if(option == 1) {
			System.out.println("헬로");
		}
		else if(option == 2) {
			System.out.println("안녕");
		}
		else if(option == 3) {
			System.out.println("프로그램 종료");
		} 
		else if(option == 10000) {
			System.out.println("이스터에그");
		}
		else {
			System.out.println("잘못된 옵션입니다.");
		}  */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("메뉴");
		System.out.println("====\n");
		System.out.println("1. 프린트 '헬로'");
		System.out.println("2. 프린트 '안녕'");
		System.out.println("3. '프로그램 종료'");
		
		System.out.print("옵션을 선택 > ");
		int option = scanner.nextInt();
		scanner.close();
		
		switch (option) {
		case 1:
			System.out.println("헬로");
			break;
			
		case 2:
			System.out.println("안녕 ?");
			break;

		case 3:
			System.out.println("프로그램 종료...");
			break;
			
		case 10000:
			System.out.println("이스터에그");
			break;
			
		default:
			System.out.println("잘못된 옵션번호.");
			break;
		}

	}

}
