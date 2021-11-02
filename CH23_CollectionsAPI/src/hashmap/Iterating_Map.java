package hashmap;

import java.util.HashMap;

public class Iterating_Map {

	public static void main(String[] args) {
		// 맵의 아이템들을 전부 읽는 방법.
		
		HashMap<String, String> months = new HashMap<>();
		
		months.put("JAN", "1월");
		months.put("FEB", "2월");
		months.put("MAR", "3월");
		months.put("APR", "4월");
		months.put("MAY", "5월");
		months.put("JUN", "6월");
		
		// 1.람다식
		months.forEach((monthCode, monthName) -> System.out.println(monthCode+ " : " +monthName));
		System.out.println("===========================1");
		
		// 2. entrySet() : key와 value 값을 가져옴.
		for(var entry: months.entrySet()) {
			String k = entry.getKey();
			String v = entry.getValue();
			
			System.out.println(k + " : " + v);
			
		}
		System.out.println("===========================2");
		
		// 3. keySet() : key 값을 가져옴.
		for(String code: months.keySet()) {
			String name = months.get(code);
			
			System.out.println(code + " : " + name);
		}
		System.out.println("===========================3");

	}

}
