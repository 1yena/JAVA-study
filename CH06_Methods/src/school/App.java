package school;

public class App {

	public static void main(String[] args) {
		
		Student s1 = new Student("징어", 7, true, 36.5);
		Student s2 = new Student("오징어", 17, false, 30);
		Student s3 = new Student("징징어", 27, true, 37.7);
		Student s4 = new Student(); // 기본생성자 값
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		
	}

}
