package yn;

import java.util.Scanner;

public class Yn1 {

	public static void main(String[] args) {
		// 안녕하세요
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("온도를 입력해주세요 : ");
		double c = scanner.nextInt();
		double f = (c * 9/5) + 32;
		
		System.out.println("섭씨 " +c+"는 화씨 "+f+"도이다.zzzz");
		
		scanner.close();
	}

}