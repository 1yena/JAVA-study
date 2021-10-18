package application;

public class App {

	public static void main(String[] args) {
		// 고양이 클래스 불러오기
		
		Cat cat1 = new Cat("마");	//count++
		Cat cat2 = new Cat("라");	//count++
				
		System.out.println(cat1);
		System.out.println(cat2);
		
		// static 변수는 객체와 상관없이 (클래스명.변수명)으로 사용한다. 객체 생성할 필요없음.
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);
		
		System.out.println(cat1.getCount());
		System.out.println(cat2.getCount());
		
		Cat cat3 = new Cat("탕");	//count++
		System.out.println(cat3);
		System.out.println(cat3.getCount());
		
	}

}
