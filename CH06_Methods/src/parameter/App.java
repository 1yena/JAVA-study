package parameter;

public class App {

	public static void main(String[] args) {
		// 칼큘레이터 객체를 만든 후 그 메소드 square를 매개변수를 입력하여 사용한다.
		
		Calculator calc = new Calculator();
		
		int number = 7;
		
		int result = calc.square(number);
		System.out.printf("%d 의 제곱은 %d이다.\n", number, result);
		
		result = calc.plus(10, 20);
		System.out.printf("두 수의 합은 %d이다.\n", result);
		
		result = calc.minus(80, 30);
		System.out.printf("두 수의 차는 %d이다.", result);

	}

}
