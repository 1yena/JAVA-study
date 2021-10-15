package constructorParmeters;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person("备备", 120.0);
		Person p2 = new Person("鳖鳖", 172.5);
		Person p3 = new Person("内内", 165.5);
		Person p4 = new Person();

		/*
		System.out.println(p1.getName());
		System.out.println(p1.getHtight());
		System.out.println(p2.getName());
		System.out.println(p2.getHtight());
		System.out.println(p3.getName());
		System.out.println(p3.getHtight());
		System.out.println(p4.getName());
		System.out.println(p4.getHtight());
		*/
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}

}
