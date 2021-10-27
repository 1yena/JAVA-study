package method_innerClass;

public class App {
	
	private String name;
	
	public App() {
		// 기본 생성자
		name = "엘리자";
	}
	
	public String getName() {
		return name;
	}

	
	private void run() {
		
		class Pt1 { 
			public void pri() {
				System.out.println(name); 	// name을 출력
				// 내부클래스에서 외부클래스 변수 사용가능
			}
		}
		//Pt1 p = new Pt1();
		//p.pri();
		new Pt1().pri(); // 위 줄을 간략히 함.
	}

	
	public static void main(String[] args) {
		// 메소드 안의 클래스
		// System.out.println(name); 이렇겐 사용 안 됨. 
		
		App app = new App();
		app.run();

	}
	

}
