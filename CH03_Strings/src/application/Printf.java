package application;

public class Printf {

	public static void main(String[] args) {
		// printf("��¼���(%d(����), %f(�Ǽ�), %c(��������), %s(���ڿ�))", ����Ұ�)
		int age = 25;
		String addr = "�λ�";
		double pi = 3.14592;
		
		
		System.out.printf("�� ���̴� %d���Դϴ�\n", age);
		System.out.printf("�� ���̴� %d���̰� %s�� ��� �ֽ��ϴ�\n", age, addr);
		System.out.printf("������ ���� %f", pi); 
		System.out.printf("������ ���� %.2f", pi); // %-f ���̿� [.x]���� ������ �Ҽ��� ��ġ ���� ����.

	}

}
