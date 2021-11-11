package operators;


public class XOR_NOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val1 = 0b01010011;
		int val2 = 0b11010110;
		
		int result1 = val1 ^ val2;		// 비트 XOR연산 : 같으면 0, 다르면 1
		
		System.out.println(toBinary(val1));
		System.out.println(toBinary(val2));
		System.out.println(toBinary(result1));
		
		System.out.println("========================");
		
		// NOT연산 = 앞에 '~' 기호 붙여. => [0 -> 1, 1 -> 0]으로 변환
		System.out.println(toBinary(~result1));

	}

	private static String toBinary(int n) {
		
		return String.format("%8s", Integer.toBinaryString(n)).replace(" ", "0");
	}

}
