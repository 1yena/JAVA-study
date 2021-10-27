package enum_methods;

public class App {

	public static void main(String[] args) {
		//values()메소드 해당 enum의 모든 상수를 저장한 배열을 리턴한다.
		//Fruit[] fruits = Fruit.values();
		
		for (Fruit f : Fruit.values()) {
			System.out.println(f);
			
		}
		
		//ordinal 메소드는 상수의 순서(인덱스 0부터 시작)를 리턴한다.
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());
		
		
		//valueOf("값")메소드
		Fruit f1 = Fruit.valueOf("ORANGE");		// 문자역 ORANGE와 같은 값을 가진 enum 상수를 찾음.
		System.out.println(f1);
		System.out.println(f1 == Fruit.ORANGE);
		System.out.println(f1 == Fruit.BANANA);
		Fruit f2 = Fruit.valueOf("BANANA");
		System.out.println(f2 == Fruit.BANANA);
		Fruit f3 = Fruit.valueOf("APPLE");
		System.out.println(f3 == Fruit.APPLE);

	}

}
