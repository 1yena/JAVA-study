package method_Overloading;

public class Person {
	
	public void greet() {
		System.out.println("�ȳ�");
	}
	public void greet(String name) {
		System.out.println("����! "+ name);
	}
	
	public void greet(int hi) {
		if(hi > 185) {
			System.out.println("Ű�� ũ����!");
		} else {
		System.out.println("Ű�� �۱���!");
		}
	}
	
	public void greet(String name, int hi) {
		if(hi > 185) {
			System.out.println("Ű�� ũ�׿�!");
		}
		System.out.println("����! " + name);
	}

}
