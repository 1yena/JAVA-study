package method;

public class Walking {

	public static void main(String[] args) {
		
		int x = 180;
		double y = 5.179;
		double result = 0;
		
		System.out.printf("ªÔ∞„ªÏ 3¿Œ∫– : %.2f", x*y*3 + "kcal");

	}
	
	
	private static double calculateCalory(int walk) {
		return 0.02 * walk;
	}
}
