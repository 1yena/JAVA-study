package this_Constuctor;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println(p1);
		Person p2 = new Person("���");
		System.out.println(p2);
		Person p3 = new Person(8);
		System.out.println(p3);
		Person p4 = new Person("���̾�", 27);
		System.out.println(p4);

	}

}
