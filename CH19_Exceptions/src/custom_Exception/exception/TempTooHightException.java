package custom_Exception.exception;

// �µ��� �ʹ� ���� ��� �߻���ų ����
public class TempTooHightException extends TempOutRangeException {
	private static final long serialVersionUID = 1L;

	public TempTooHightException(String message) {
		// ������ ���� �޼����� ���� ����Ŭ������ ó��
		super(message); 	// ����Ŭ�������� �޼��������� ���ܸ� ����
		
	}

}
