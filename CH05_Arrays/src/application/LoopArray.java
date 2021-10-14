package application;

public class LoopArray {

	public static void main(String[] args) {
		// for 반복문과 인덱스 i를 이용해 배열의 첫번째부터 끝까지 출력하라.

		String[] animal = { "개", "고양이", "닭", "사자", "양", "말", "펭귄", "갈매기", "병아리", "치킨" };

		for (int i = 0; i < animal.length; i++) {
			System.out.println(animal[i]);
		}

		// ".length" 자동으로 배열의 수만큼 반복됨.
	}

}
