package example;

import java.util.ArrayList;
import java.util.List;

public class App3 {
	public static void main(String[] args) {		
	List<Integer> num = new ArrayList<>();
	
	num.add(1);
	num.add(6);
	num.add(4);
	num.add(7);
	num.add(3);
	num.add(6);
	num.add(3);
	
	num.removeIf(App3::filter);
	num.replaceAll(App3::map);
	
	num.forEach(System.out::println);
	
	
	}
	
	// 메소드 레퍼런스
	// 1. static
	// 2. return과 매개변수를 맞춘다.
	private static boolean filter(Integer n) {
		return n < 5;
	}
	
	private static int map(int n) {
		return n * 2;
	}

}
