package example;

public class Split_String {

	public static void main(String[] args) {
		// 문자열.split("") => 문자열을 공백(space)로 쪼개서 배열로 리턴한다.
		
		String t1 = "When Joe Manchin stepped to the podium in the US Capitol on Monday afternoon, the hope among Democrats was that he was going to announce that he supported the $1.75 trillion social safety net bill -- a moment that would virtually ensure passage of the bulk of President Joe Biden's first-term domestic agenda.";
		String t2 = "경찰청은 단계적 일상 회복 시행으로 연말연시 술자리가 늘어날 것으로 보임에 따라, 내년 1월까지 유흥가와 식당 등 지역별 음주운전 위험 지역을 중심으로 단속을 이어갈 예정입니다.";
		
		String[] words = t1.split("[^a-zA-Z]+");	// 정규표현식[] : '^'는 시작문자임. / 영문 a~z, A~Z까지 표현한다.
		String[] cool = t2.split("[^가-힣]+");		// 정규표현식[] : '^'는 시작문자임. / 한글 '가~힣'까지 표현한다.
		
		for(String w: words) {
			
			if(w.length() <= 2) { // 철자 두 개 이하는 빼기.
				continue; // 제거
			}
			
			System.out.println(w.toLowerCase());	// 전부 소문자로 변환하여 출력.
		}
		
		System.out.println("===============================");
		
		for(String c: cool) {
			System.out.println(c);	// 전부 소문자로 변환하여 출력.
		}

	}

}
