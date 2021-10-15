package test;

public class TernaryCondition {

	public static void main(String[] args) {
		// ���� ���� ������ : ���� ? A : B
		System.out.println(true ? "yes" : "no"); // trus�� �տ� ��
		System.out.println(false ? "yes" : "no"); // false�� �ڿ� ��

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





