package application;

public class ControlCharacter {

	public static void main(String[] args) {
		// 문자열 안에 있는 제어문자
		System.out.println("============================");
		System.out.println("\t탭\t탭만큼 띄웁니다.");
		System.out.println("============================");
		System.out.println("자바를\n배우고\n있습니다.");
		//[\t]는 탭만큼 띄움
		//[\n]은 한 줄을 띄움.
		//[println]로 출력하면 자동으로 한 줄을 띄움
		System.out.print("그냥 프린트는");
		System.out.print(" 줄을 띄우지 않습니다.");
		//[print]는 한 줄 띄우는 기능 없음.
	}

}
