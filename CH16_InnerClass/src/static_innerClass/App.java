package static_innerClass;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.print();
		
		// 이너클래스 (객체를 만들 때도 먼저 외부클래스 객체를 만들고 만들 수 있다.)
		Person.Head head = p1.new Head();
		head.print();
		
		
		
		//static 이너클래스 외부객체에서 바로 .Body();
		Person.Body body = new Person.Body();
		body.print();
		
		
		
		

	}

}
