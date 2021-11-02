package yn;

import java.util.Scanner;

public class Yn1 {

	public static void main(String[] args) {
		// 안녕하세요
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사과의 개수는 ? ");
		
		int a = scanner.nextInt();
		
		System.out.println("바나나의 개수는 ? ");
		
		int b = scanner.nextInt();
		
		scanner.close();
		
		
		if(a < b) {
			System.out.println("바나나");
		} else if(a > b) {
			System.out.println("사과");
		} else {
			System.out.println("개수가 같다");
		} 
		
		System.out.println("시스템 종료");
	}

}
