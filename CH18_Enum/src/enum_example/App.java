package enum_example;

public class App {

	public static void main(String[] args) {
		Fruit f1 = Fruit.APPLE;
		Fruit f2 = Fruit.ORANGE;
		Fruit f3 = Fruit.BANANA;
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f1 == f2);
		System.out.println(f3);
		System.out.println(f3 == f3);

	}

}
