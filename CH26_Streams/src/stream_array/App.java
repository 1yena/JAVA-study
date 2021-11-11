package stream_array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.of("hello", "bottole", "africa")
			.sorted()		// 정렬 : 알파벳순 or 한글수
			.findFirst()	// 첫번째
			.ifPresent((x) -> System.out.println(x));	// if 존재하면 출력(없으면 출력 X)
		
		System.out.println("=======================1");
		
		String[] items = {"치킨", "원숭이", "고릴라", "치약", "고라니", "치과", "고양이"};
		Stream.of(items)
			.filter(x -> x.startsWith("치"))	// predicate 객체: 참/거짓으로 필터링한다. => 참이면 남고 거짓이면 제외.
			.sorted()						// 정렬
			.forEach(x -> System.out.println(x + ","));
		
		System.out.println("=======================2");
		
		Arrays.stream(new int[] {2,4,6,8,10})	// 정수 배열을 new로 생성과 동시에 초기화
			.filter(x -> x < 5)	// 5보다 작으면 참이다.
			.map(x -> x*x)		// 5보다 작은 수를 제곱을 해서 리턴
			.average()			// 위 값의 평균값
			.ifPresent(n -> System.out.println(n));
		
		System.out.println("=======================3");
		
		// 배열을 리스트로 바꾸는 방법 Arrays.asList(배열)
		List<String> list = Arrays.asList(items);
		list.stream()
			.filter(x -> x.startsWith("고"))
			.sorted()
			.forEach(x -> System.out.println(x + ","));
		
		// 배열은 Stream.of(배열): 스트림 생성, 리스트는 stream() 생성
		// filter(x -> 조건): 조건이 참이면 남기고 아니면 제외.
		// sorted(): 정렬
		// map(x -> 리턴값): 아이템의 값을 리턴값으로 바꿈

	}

}
