package application;

public class ForEachArray {

	public static void main(String[] args) {
		// for each �ݺ���
		
		int[] number = {2,4,6};
		String[] fruits = { "�ٳ���", "���", "����" };
		
		for(int n : number) {
			System.out.println(n);
		}
		
		for(String f : fruits) {
			System.out.println(f);
		}

	}

}
