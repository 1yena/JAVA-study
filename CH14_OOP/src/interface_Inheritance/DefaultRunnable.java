package interface_Inheritance;

// �������̽��� �������̽��� ���
public interface DefaultRunnable extends Runnable { //'Runnable'�� ���α׷� ��ü�� �ִ� �⺻ �������̽���. 'run'�̶�� �߻�޼ҵ带 �⺻���� ������ ����.
	default void dispalyDetails() { // default �޼ҵ�� �޼ҵ� �ڵ带 �������� ��.
		System.out.println("ǥ���� �������̶�!");
		
	}

}
