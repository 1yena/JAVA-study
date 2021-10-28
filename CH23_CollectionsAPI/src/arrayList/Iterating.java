package arrayList;

import java.util.ArrayList;

public class Iterating {

	public static void main(String[] args) {
		// 반복문으로 자료를 꺼내는 방법

		ArrayList<Integer> list = new ArrayList<>();
		
		// 입력
		list.add(7);
		list.add(9);
		list.add(123);
		list.add(9999);
		
		
		// for each 문
		for(Integer n : list) {
			System.out.println(n);
		}
		
		System.out.println(); // 한 줄 띄우기
		
		// for 반복문 (인덱스 번호를 같이 쓸 때)
		for(int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);
			
			System.out.println("인덱스 " + i + " : " + n);
		}
		
		System.out.println(); //한 줄 띄우기
		
		// 리스트.forEach 메소드 람다식
		list.forEach(e -> System.out.println(e));
		
		System.out.println(); // 한 줄 띄우기
				
		// 메소드 레퍼런스
		list.forEach(System.out::println);
		
		
	}

}
