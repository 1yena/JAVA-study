package linked_HashSet;

import java.util.LinkedHashSet;

public class App {

	public static void main(String[] args) {
		// 링크드 헤쉬셋 : 중복 안 되고 입력된 순서대로 출력
		
		LinkedHashSet<String> fruits = new LinkedHashSet<>();
		
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");
		
		System.out.println(fruits.contains("오렌지"));	// 오렌지 있으니까 참 (없는 건 거짓)
		
		for(String f : fruits) {
			System.out.println(f);	// 중복 제외하고 순서대로 출력
		}

	}

}
