package application;

public class StringArray {

	public static void main(String[] args) {
		// 문자열로 만드는 배열
		
		String[] animals = { "집", "에", "가", "자" };
		
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		System.out.println(animals[3]);
		
		//System.out.println(animals[4]); 없는 값을 출력하면 에러가 남.
		
		animals[0] = "닭장"; //집을 닭장으로 다시 선언.
				
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		System.out.println(animals[3]);

	}

}
