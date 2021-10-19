package method_Overloading;

public class Person {
	
	public void greet() {
		System.out.println("안녕");
	}
	public void greet(String name) {
		System.out.println("웰컴! "+ name);
	}
	
	public void greet(int hi) {
		if(hi > 185) {
			System.out.println("키가 크군요!");
		} else {
		System.out.println("키가 작군요!");
		}
	}
	
	public void greet(String name, int hi) {
		if(hi > 185) {
			System.out.println("키가 크네요!");
		}
		System.out.println("오구! " + name);
	}

}
