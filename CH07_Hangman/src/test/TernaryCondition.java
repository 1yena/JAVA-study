package test;

public class TernaryCondition {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 삼항 조건 연산자 : 조건 ? A : B
		System.out.println(true ? "yes" : "no"); // trus면 앞에 값
		System.out.println(false ? "yes" : "no"); // false면 뒤에 값

		int value = 109;
		value = value > 100 ? 100 : value;
		System.out.println(value);

		int[] values = { 6, 7, 99, 45, 34 };
		int max = 0;
		for(int x : values) {
			max = x > max ? x : max;	
		}
		
		System.out.println(max);

	}

}





