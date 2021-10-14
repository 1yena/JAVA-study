package application;

public class DoWhile {

	public static void main(String[] args) {
		// do while은 처음 한번은 조건과 상관없이 실행
		// 무조건 한 번은 실행을 하고 그 다음 비교를 함.
		
		int count = 100;
		
		System.out.println("do while 반복문");
		
		do {
			System.out.println("count: " + count);
		} while (count++ < 5);

	}

}
// 일단 한 번 실행해서 "100" 값이 출력되고 그 다음 비교했는데 안 맞으니까 종료.
