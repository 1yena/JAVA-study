package staticMethod;

public class Cat {
	
	private String name; //고양이 이름
	private int id; //고양이 아이디
	
	public  static final String FOOD = "고양이 사료"; //final은 상수(변하지 않는 값)
	
	//static 변수는 객체에서 공유 가능함.
	private static int count = 0; //생성한 고양이의 숫자
	
	public Cat(String name) { //생성자는 return 타입이 없음(일반 메소드랑 다름)
		this.name = name;
		
		//id = count; 	//여기다 코드 넣으면 아이디가 0번부터 출력
		count++; 		//고양이 객체 생성 시 static count가 +1이 된다.
		id = count; 	//여기다 코드 추가 넣으면 아이디가 1번부터 출력
	}

	@Override
	public String toString() {
		return "고양이 [아이디 ="+id + ", 이름 = " + name + "]";
	}
	
	public static int getCount() { 
		//String n = name; => static 메소드는 인스턴스(객체) 변수를 사용할 수 없다.
		return count;
	}
	
}
		


