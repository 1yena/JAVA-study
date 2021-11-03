package lambda_Interface;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAll {

	public static void main(String[] args) {
		// 리스트의 아이템값을 연산 결과로 대체
		
		List<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(3);
		num.add(4);
		num.add(7);
		num.add(5);
		
		num.replaceAll(n -> n * n);
		
		num.forEach(t -> System.out.println(t));
		
		System.out.println("===========");
		
		List<String> fri = new ArrayList<>();
		fri.add("펭수");
		fri.add("길동");
		fri.add("메리");
		fri.add("코난");
		fri.add("뚱이");
		
		fri.replaceAll(s -> "안녕! " + s);
		
		fri.forEach(t -> System.out.println(t));
		
	}

}
