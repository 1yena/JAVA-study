package method;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		System.out.println(p1.name); //참조 자료형 [string]은 "null"값이 초기값
		System.out.println(p1.age);	 //[int]는 "0"이 초기값
		
		p1.sayHello(); // 클래스 person에 있는 메소드를 호출함
		
		p1.name = "펭수";
		p1.age = 111;
		
		System.out.println(p1.name + " " + p1.age); 
		System.out.println(p1.age);	
		
		p1.sayHello();
		
		Person p2 = new Person();
		p2.name = "길동";
		p2.age = 777;
		
		Person p3 = new Person();
		p3.name = "라이언";
		p3.age = 999;
		
		p2.sayHello();
		p3.sayHello();

	}

}
