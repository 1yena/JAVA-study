package method_innerClass;

public class App {
	
	private String name;
	
	public App() {
		// �⺻ ������
		name = "������";
	}
	
	public String getName() {
		return name;
	}

	
	private void run() {
		
		class Pt1 { 
			public void pri() {
				System.out.println(name); 	// name�� ���
				// ����Ŭ�������� �ܺ�Ŭ���� ���� ��밡��
			}
		}
		//Pt1 p = new Pt1();
		//p.pri();
		new Pt1().pri(); // �� ���� ������ ��.
	}

	
	public static void main(String[] args) {
		// �޼ҵ� ���� Ŭ����
		// System.out.println(name); �̷��� ��� �� ��. 
		
		App app = new App();
		app.run();

	}
	

}
