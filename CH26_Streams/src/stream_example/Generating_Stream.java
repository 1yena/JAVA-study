package stream_example;

import java.util.stream.Stream;

public class Generating_Stream {

	public static void main(String[] args) {
		// Stream.of()를 사용해 간단하게 스트림 생성
		Stream.of(1,2,3).forEach(System.out::println);
		
		System.out.println("==================");
		
		Stream.of("하나","둘","셋").forEach((t) -> System.out.println(t));
		
		System.out.println("==================");
		
		// Stream.generate[람다식]으로 생성
		Stream.generate(()->"헬로").limit(5).forEach(System.out::println);	// 헬로 5번 반복
		
	}

}
