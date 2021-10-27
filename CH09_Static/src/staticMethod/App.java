package staticMethod;

public class App {

	public static void main(String[] args) {
		// static 메소드 getCount 사용
		
		// String.format은 printf를 문자열로 리턴됨.
		String catCount = String.format("고양이 숫자 : %d\n", Cat.getCount());
		System.out.println(catCount);
		
		Cat cat1 = new Cat("마");
		Cat cat2 = new Cat("라");
		Cat cat3 = new Cat("탕");
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		
		catCount = String.format("고양이 숫자 : %d\n", Cat.getCount());
		System.out.println(catCount);
		
		int x = add(10, 2);
		System.out.println(x);
		
	}

	private static int add(int a, int b) {
		
		return a+b;
	}

}
