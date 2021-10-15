package constructors;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.setName("²Ç²Ç");
		p1.setHtight(120.0);

		Person p2 = new Person();
		p2.setName("¿ä¿ä");
		p2.setHtight(172.5);
		
		Person p3 = new Person();
		p3.setName("´»´»");
		p3.setHtight(165.5);

		System.out.println(p1.getName());
		System.out.println(p1.getHtight());
		System.out.println(p2.getName());
		System.out.println(p2.getHtight());
		System.out.println(p3.getName());
		System.out.println(p3.getHtight());
		
	}

}
