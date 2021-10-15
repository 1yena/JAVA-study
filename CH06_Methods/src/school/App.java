package school;

public class App {

	public static void main(String[] args) {
		
		Student s1 = new Student("Â¡¾î", 7, true, 36.5);
		Student s2 = new Student("¿ÀÂ¡¾î", 17, false, 30);
		Student s3 = new Student("Â¡Â¡¾î", 27, true, 37.7);
		Student s4 = new Student(); // ±âº»»ý¼ºÀÚ °ª
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		
	}

}
