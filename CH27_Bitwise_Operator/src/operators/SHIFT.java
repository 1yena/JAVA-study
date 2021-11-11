package operators;


public class SHIFT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val = 0b00010001;
		
		System.out.println(toBinary(val));
		
		System.out.println("==================1");
		
		
		int re1 = val << 3;		// 왼쪽으로 3번 쉬프트
		
		System.out.println(toBinary(re1));
		
		System.out.println("==================2");
		
		
		int re2 = re1 >> 3;		// 다시 오른쪽으로 3번 쉬프트
		
		System.out.println(toBinary(re2));
		
		System.out.println("==================3");
		
		System.out.println(100 << 2);	// 곱하기 2 곱하기 2
		System.out.println(100 >> 1);	// 나누기 2


	}

	private static String toBinary(int val) {
		
		return String.format("%8s", Integer.toBinaryString(val)).replace(" ", "0");
	}

}
