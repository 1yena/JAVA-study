package application;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// 예제 1
		
		Scanner scanner = new Scanner(System.in);
		
		final int num = 5; //배열의 크기(아이템의 개수)
		
		int[] number = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("숫자를 입력 : ");
			number[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		int total = 0; // 숫자의 합을 계산할 변수
		
		for(int i=0; i<num; i++) {
			
			System.out.println(number[i]);
			total = total + number[i]; //배열 아이템의 하나하나의 값을 더함.
					
		}

		System.out.println("합계 : " + total);
		
	}

}
