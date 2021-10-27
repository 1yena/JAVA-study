package static_innerClass;

public class Person {
	class Head { // 내부클래스 Head
		public void print() {
			System.out.println("헤드");
		}
	}
	static class Body { // static 내부클래스 Body
		public void print() {
			System.out.println("바디");
		}
	}

	public void print() { // 클래스 Person의 메소그
		Head head = new Head(); //헤드 객체
		Body body = new Body();	//바디 객체
		
		head.print();
		body.print();
		
	}

}
