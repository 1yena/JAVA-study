package arrayList;


import java.util.ArrayList;
import java.util.Collections;

public class Sorting_list {

	public static void main(String[] args) {
		// 리스트를 정렬
		
		ArrayList<Double> doubles = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		doubles.add(7.38);
		doubles.add(3.88);
		doubles.add(1.45);
		doubles.add(2.35);
		doubles.add(9.28);
		doubles.add(12.49);
		
		list.add(9);
		list.add(7);
		list.add(5);
		list.add(19);
		list.add(14);
		list.add(1);
		
		Collections.sort(doubles);	// 정렬
		Collections.sort(list);	// 정렬
		
		doubles.forEach(System.out::println);
		System.out.println("================");
		list.forEach(System.out::println);
		
		// 커스텀 객체 정렬
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(new Person("펭수"));
		people.add(new Person("길동"));
		people.add(new Person("라이언"));
		people.add(new Person("둘리"));
		
		System.out.println("================");
		people.forEach(System.out::println);
		
		Collections.sort(people);
		
		System.out.println("================");
		people.forEach(System.out::println);

	}

}
