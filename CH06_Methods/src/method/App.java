package method;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		System.out.println(p1.name); //���� �ڷ��� [string]�� "null"���� �ʱⰪ
		System.out.println(p1.age);	 //[int]�� "0"�� �ʱⰪ
		
		p1.sayHello(); // Ŭ���� person�� �ִ� �޼ҵ带 ȣ����
		
		p1.name = "���";
		p1.age = 111;
		
		System.out.println(p1.name + " " + p1.age); 
		System.out.println(p1.age);	
		
		p1.sayHello();
		
		Person p2 = new Person();
		p2.name = "�浿";
		p2.age = 777;
		
		Person p3 = new Person();
		p3.name = "���̾�";
		p3.age = 999;
		
		p2.sayHello();
		p3.sayHello();

	}

}
