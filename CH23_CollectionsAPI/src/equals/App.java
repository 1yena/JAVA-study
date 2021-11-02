package equals;


class Person { 
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object other) {
		// Object클래스의 equals 오버라이드해서 Person클래스의 이름으로 비교하도록 수정함.
		
		if(other == null) return false;			// 널값이면 false
		if(other == this) return true;			// 같은 객체면 true
		if(!(other instanceof Person)) return false;	// 같은 타입이 아니면 false
		if(this.name == null) return false;		// this 객체의 이름값이 널이면 false
		Person p = (Person)other;				// 다운캐스팅 타입 변환
		if(p.name == null) return false;		// other 객체의 이름값이 널이면 false
		
		return this.name.equals(p.name);		// 문자열의 equals 메소드(즉 문자열 자체를 비교)
	}
	
}

public class App {
	public static void main(String[] args) {
		// equals 메소드 추가
		
		Person p1 = new Person("펭수");
		Person p2 = new Person("펭수");
		
		System.out.println(p1 == p2);		// 객체의 주소를 비교
		System.out.println(p1.equals(p2));	// equals 메소드를 다시 작성하여 이름값으로 출력.

	}

}
