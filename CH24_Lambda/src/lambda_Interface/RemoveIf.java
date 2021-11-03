package lambda_Interface;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {

	public static void main(String[] args) {
		// 특정타입(제네릭)을 검사(test)해서 참/거짓 판별해 리턴
		List<Integer> num = new ArrayList<>();
		
		num.add(3);
		num.add(5);
		num.add(7);
		num.add(2);
		num.add(9);
		num.add(10);
		num.add(4);
		
		// removeIf 메소드는 리스트의 아이템을 Precate의 test메소드로 검사해서 참이면 제거
		num.removeIf(n -> n < 5);	// 정수가 5보다 작으면 참
									// removeIf : 참이면 제거한다.
		
		num.forEach(t -> System.out.println(t));

	}

}
