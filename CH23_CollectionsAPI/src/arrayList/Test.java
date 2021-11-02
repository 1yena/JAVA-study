package arrayList;

//import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Double> numbers = new ArrayList<>();
		
		double total = 0;
		
		while (true) {	// "q"가 입력될 때까지 반복

			System.out.print("숫자 또는 'q' 입력 > ");

			String input = scanner.nextLine(); 		// 엔터 전까지 입력한 문자열을 저장

			input = input.trim(); 					// 만약 공백이 앞뒤에 있으면 제거(trim : 공백제거).
			
			if(input.equalsIgnoreCase("q")) {		// 만약 입려된 문자열이 "q"와 같으면 반복문 종료
													// "equalsIgnoreCase"는 대소문자를 동일하게 한다.(Q, q 둘 다 가능)
				System.out.println("종료");
				break;
			}

			try {
				double value = Double.parseDouble(input); // 문자열 숫자를 실수로 변환
				numbers.add(value);						  // 입력한 실수를 리스트에 저장
				total = total + value;
			} catch (NumberFormatException e) {
				// 예외 발생 =  실수를 변환할 때 발생한 예외
				// "NumberFormatException" : 숫자가 아닌 문자열을 입력해도 에러 안 나게 해줌
				System.out.println("숫자가 아닙니다.");
				continue;
			}
			
			
		}

		scanner.close();

		System.out.println();
		
		if(numbers.size() > 0) {
	
		System.out.println("입력된 숫자 : ");
		
		Collections.sort(numbers);	// 입력된 숫자 정렬
		
		for (Double number : numbers) {
			System.out.printf("%.2f\n", number); // 실수를 소수점 2자리까지 출력.
			}
		System.out.println("=============");
		System.out.printf("평균값 : %.2f ", total/numbers.size()); // 입력된 숫자 평균값
		
		} else { // 숫자 입력 없이 바로 "q"로 종료했을 경우 메세지.
			
		System.out.println("실수가 입력되지 않았습니다.");
		
			}
		
	}

}
