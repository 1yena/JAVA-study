package hashset;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		// 셋(set)형은 순서가 없고, 데이터의 중복이 없다.
		
		HashSet<String> f = new HashSet<>();
		
		f.add("사과");
		f.add("바나나");
		f.add("오렌지");
		f.add("오렌지");
		f.add("배");
		f.add("사과");
		f.add("사과");
		
		System.out.println(f.contains("오렌지"));
		
		for(var f1: f) {
			System.out.println(f1);
		}
		
		// 셋 리스트에 특정 아이템이 있는지 확인
		System.out.println(f.contains("오렌지"));
		
	}

}
