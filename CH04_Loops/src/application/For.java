package application;

public class For {

	public static void main(String[] args) {
		// for 반복문 for(초기값;조건;증감) { 명령문; }
		
		/* 초기값,조건,증감 아무것도 없으면 무한반복
		for(;;) {
			System.out.println("무한반복");
		*/
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			System.out.println(sum = sum+i);
			
		}
		/* int sum = 0;
		for(int i=1; i<=100; i++) {
			sum = sum+i; 
		System.out.println(sum);
			*/
		
		/* int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i; 
		System.out.println(sum)
			*/
		
	}
}