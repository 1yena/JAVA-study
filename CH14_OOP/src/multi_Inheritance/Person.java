package multi_Inheritance;

public class Person implements Speaker, Greeter {
	// �������̽��� ����(������)������ ���������� ���(extends)�� �ϳ��� �ȴ�.

	@Override
	public void greet() {
		System.out.println("ȯ���մϴ�!");
		
	}

	@Override
	public void speak() {
		System.out.println("���� Person�Դϴ�.");
		
	}

}
