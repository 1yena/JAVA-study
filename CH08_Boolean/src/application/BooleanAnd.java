package application;

public class BooleanAnd {

	public static void main(String[] args) {
		// [ ==(같다), !=(같지않다), !(반대), &&(and), ||(or) ]
		
		boolean isRaining = false; 		// 비가 오는가?
		boolean haveUmbrella = true; 	// 우산이 있는가?
		boolean takeUmbrella = false; 	// 우산을 쓰나?
		
		
		// 1. 비가 오고 우산이 있으면 takeUmbrella는 true다. (비가 오고 우산이 있으면 우산을 쓴다.)
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
			}
		} 
		System.out.println("첫번째 경우 : " + takeUmbrella);
		
		// 1-1. 첫번째 경우를 And (&&) 연산자로 사용.
		if(isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		System.out.println("And 사용시 : " + takeUmbrella);
		
		// 1-2. 첫번째 경우를 삼항조건 연산자로 사용.
		takeUmbrella = isRaining && haveUmbrella ? true : false;
		
		System.out.println("삼항조건 사용시 : " + takeUmbrella);
		
	}

}
