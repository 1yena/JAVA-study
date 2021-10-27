package application;

public class Ex2 {

	public static void main(String[] args) {
		// 예제 2

		int[][] values = { { 1, 5, 7 }, { 9, 6, 3 }, { 2, 4, 6 }, { 10, 11, 13 } };

		int total = 0;
		for (int i = 0; i < values.length; i++) {

			for (int j = 0; j < values[i].length; j++) {
				total = total + values[i][j];
			}

		}

		System.out.println("총합은 : " + total);

	}

}
