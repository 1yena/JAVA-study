package try_catch_Final;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		try {
			p1.setName("���");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// ���ܰ� �߻��ϵ� �� �ϵ� ������ �����.
			System.out.println("final ������ ����");
		}
		
		System.out.println("���α׷� ����");
	}
}
