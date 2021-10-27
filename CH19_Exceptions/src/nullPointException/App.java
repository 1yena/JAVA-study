package nullPointException;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// 널포인트, 0으로 나누었을 때 => 런타임 예외 발생
		// 1번. 0으로 나누었을 때 
		try {
			System.out.println(5/0);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		// 2번. 객체의 주소값이 널(null)일 때!! -- 특히 많이 발생
		Scanner scanner = null; 	// new Scanner(System.in);
		
		try {
			scanner.nextLine();
			scanner.close();
		} catch (NullPointerException e) {
			System.out.println("객체의 값이 널입니다.");
		}
		

	}

}
