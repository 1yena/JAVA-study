package custom_Exception.exception;

// �µ��� ���ų� �ʹ� ���� ��� �߻��ϴ� ������ ����Ŭ����
public class TempOutRangeException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public TempOutRangeException(String message) {
		// ������ ���� �޼����� ���� ����Ŭ������ ó��
		super(message); 	// ����Ŭ�������� �޼��������� ���ܸ� ����
		
	}

}
