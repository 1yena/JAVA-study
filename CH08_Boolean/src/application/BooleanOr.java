package application;

public class BooleanOr {

	public static void main(String[] args) {
		// ||(or) 논리연산자
		
		boolean isRaining = true; 		// 비가 오는가?
		boolean mightRain = false; 		// 비가 올 수도 있는가?
		boolean takeUmbrella = false; 	// 우산을 쓰나?
		
		takeUmbrella = isRaining || mightRain; // 비가 오거나 또는 올 수도 있는 경우 : 하나라도 참이면 결과는 참.
		
		System.out.println(takeUmbrella);

	}

}
