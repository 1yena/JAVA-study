package application;

public class Boolean {

	public static void main(String[] args) {
		// 불린 타입은 참 또는 거짓 (true, false)
		boolean bool1 = false;
		System.out.println("조건1: "+bool1);
		
		//비교 결과 참, 거짓 (true, false)
		boolean bool2 = 4 < 5;
		System.out.println("조건2: "+bool2);
		
		//비교 결과 참, 거짓 (true, false)
		boolean bool3 = 14 < 5;
		System.out.println("조건3: "+bool3);
		
		//비교 ==, !=, >=, <= (true, false)
		boolean bool4 = 14 == 5;
		System.out.println("조건4: "+bool4);
		
		//비교 ==, !=, >=, <= (true, false)
		boolean bool5 = 14 != 5;
		System.out.println("조건5: "+bool5);

		//비교 ==, !=, >=, <= (true, false)
		boolean bool6 = 14 != 5;
		System.out.println("조건6: "+bool6);
		System.out.printf("조건6: %b \n", bool6);


	}

}
