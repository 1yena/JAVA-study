package stream_example;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(1);
		num.add(3);
		num.add(6);
		num.add(2);
		num.add(4);
		
		num.stream().forEach(System.out::println);
		
		System.out.println("=============");
		
		num.stream().forEach(n -> System.out.println(n));

	}

}
