package application;

public class StringArray2 {

	public static void main(String[] args) {
		// string은 깁ㄴ 자료형이 아닌 참조 자료형, 참조 변수는 기본적으로 주소값을 갖는다.

		// 널은 참조변수에 주소값이 없음.
		String text = null;
		
		// text = new string("헬로!"); new는 메모리에 문자열 공간을 만듦.
		text = "헬로!";
		System.out.println(text);
		
		String[] texts = null;
		System.out.println(texts);
		
		texts = new String[3]; 		// 3개의 문자열 배열공간을 생성.
		System.out.println(texts);  // 배열의 주소값을 출력.
		
		System.out.println("===========");
		
		texts[0] = new String("하이!");
		texts[1] = "안녕";
		texts[2] = "굿바이";
		
		for(String word: texts) {
			
			System.out.println(word);
		}
		
	}
	

}
