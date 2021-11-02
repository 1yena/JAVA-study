package hashSet_union_intersection;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> fruits1 = new HashSet<String>();
		fruits1.add("사과");
		fruits1.add("배");
		fruits1.add("딸기");
		fruits1.add("수박");
		
		HashSet<String> fruits2 = new HashSet<String>();
		fruits2.add("체리");
		fruits2.add("배");
		fruits2.add("사과");
		fruits2.add("오렌지");
		
		// 합집합 리스트 만들기
		// 생성자의 () 안에 리스트를 넣으면 넣은 리스트의 모든 값이 입력된 리스트가 생성
		HashSet<String> union = new HashSet<String>(fruits1);
		union.forEach(System.out::println);
		
		System.out.println("=========================0");
		
		union.addAll(fruits2);	// 현재 리스트에 fruits2 리스트를 합침
		union.forEach(System.out::println);
		
		System.out.println("=========================1");
		
		// 교집합 리스트 만들기
		HashSet<String> intersection = new HashSet<String>(fruits1);
		intersection.retainAll(fruits2);	// 첫 번째 리스트와 두 번째 리스트가 같은 아이템만 남김.
		
		intersection.forEach(System.out::println);
		
		System.out.println("=========================2");
		
		// 마이너스 A - B : 두 번째 리스트로 빼고 남은 아이템들
		HashSet<String> minus = new HashSet<String>(fruits1);
		minus.removeAll(fruits2);
		
		minus.forEach(System.out::println);

	}

}
