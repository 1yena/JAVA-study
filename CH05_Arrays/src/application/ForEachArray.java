package application;

public class ForEachArray {

	public static void main(String[] args) {
		// for each 반복문
		
		int[] number = {2,4,6};
		String[] fruits = { "바나나", "사과", "수박" };
		
		for(int n : number) {
			System.out.println(n);
		}
		
		for(String f : fruits) {
			System.out.println(f);
		}

	}

}
