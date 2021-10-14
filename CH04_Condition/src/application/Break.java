package application;

public class Break {

	public static void main(String[] args) {
		// break 반복문 안에서 사용시 반복문을 빠져나옴.
		
		int count = 0;
		while (true) {
			
			System.out.println("헬로." + count);
			
			if (count == 5) { //count가 5가 되면
				break;		  //반복문은 빠져나옴.
				
			}
			
			System.out.println("how are you");
			System.out.println("z" + count);
			count++;
		}
		
		System.out.println("program finished");

	}

}

// [if (count == 5) break;]
// 명련문이 한 줄 만 있을 땐 생략도 가능.
