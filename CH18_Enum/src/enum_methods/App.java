package enum_methods;

public class App {

	public static void main(String[] args) {
		//values()�޼ҵ� �ش� enum�� ��� ����� ������ �迭�� �����Ѵ�.
		//Fruit[] fruits = Fruit.values();
		
		for (Fruit f : Fruit.values()) {
			System.out.println(f);
			
		}
		
		//ordinal �޼ҵ�� ����� ����(�ε��� 0���� ����)�� �����Ѵ�.
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());
		
		
		//valueOf("��")�޼ҵ�
		Fruit f1 = Fruit.valueOf("ORANGE");		// ���ڿ� ORANGE�� ���� ���� ���� enum ����� ã��.
		System.out.println(f1);
		System.out.println(f1 == Fruit.ORANGE);
		System.out.println(f1 == Fruit.BANANA);
		Fruit f2 = Fruit.valueOf("BANANA");
		System.out.println(f2 == Fruit.BANANA);
		Fruit f3 = Fruit.valueOf("APPLE");
		System.out.println(f3 == Fruit.APPLE);

	}

}
