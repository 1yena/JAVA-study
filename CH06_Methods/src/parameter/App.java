package parameter;

public class App {

	public static void main(String[] args) {
		// Įŧ������ ��ü�� ���� �� �� �޼ҵ� square�� �Ű������� �Է��Ͽ� ����Ѵ�.
		
		Calculator calc = new Calculator();
		
		int number = 7;
		
		int result = calc.square(number);
		System.out.printf("%d �� ������ %d�̴�.\n", number, result);
		
		result = calc.plus(10, 20);
		System.out.printf("�� ���� ���� %d�̴�.\n", result);
		
		result = calc.minus(80, 30);
		System.out.printf("�� ���� ���� %d�̴�.", result);

	}

}
