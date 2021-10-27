package parameter;

public class Calculator {
	// 메소드 이름 뒤 "()" 안에 매개변수(파라메터)가 들어감.
	
	int square(int x) {		// "(int x)"가 매개변수로서 입력되는 값임.
		
		return x*x;		// 입력값 "x"를 제곱해서 리턴하는 메소드다.
		
	}

	int plus(int x, int y) {
		return x + y;
	}
	
	int minus(int x, int y) {
		return x - y;
	}
	
}
