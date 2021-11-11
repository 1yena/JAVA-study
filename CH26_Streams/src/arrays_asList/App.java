package arrays_asList;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// 배열을 리스트로
		
		List<String> names = Arrays.asList("에릭", "엘레나", "자바", "도레미");
		
		names.stream()
			.filter(name -> name.contains("레"))		// '레'가 들어가는 단어.
			.map(String::toUpperCase)				// 대문자로 변환
			.forEach(System.out::println);			// 출력
		
		System.out.println("================================");
		
		List<Integer> num = Arrays.asList(9,4,6,3,1,2,7);
		
		num.stream()
			.filter(n -> n > 3)		// 9, 4, 6, 7만 남는다
			.sorted()				// 4, 6, 7, 9로 정렬
			.map(s -> s*10)			// 각 수에 곱하기 10 = 40, 60, 70, 90
			.forEach(System.out::println);

	}

}
