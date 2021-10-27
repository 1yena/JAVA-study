package convertingTemp;

public class App {

	public static void main(String[] args) {
		// 섭씨 Celsius => 화씨 Fahrenheit 변환
		
		double c = 25; //섭씨
		double f = (c * 9/5) + 32; //화씨
		
		System.out.println("섭씨 " +c+ "도는 화씨 "+f+"도이다.");
		
	}

}
