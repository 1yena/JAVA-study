package method_Overloading;

public class App {

	public static void main(String[] args) {
		//�޼ҵ� �����ε� �޼ҵ��� �̸��� ������ �Ű������� �ٸ� ��
		Person person = new Person();
		
		person.greet();
		person.greet("����");
		
		person.greet(170);
		person.greet("���̾�", 170);
		
		person.greet(170);
		person.greet("���", 170);
	}

}
