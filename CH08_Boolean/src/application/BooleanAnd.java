package application;

public class BooleanAnd {

	public static void main(String[] args) {
		// [ ==(����), !=(�����ʴ�), !(�ݴ�), &&(and), ||(or) ]
		
		boolean isRaining = false; 		// �� ���°�?
		boolean haveUmbrella = true; 	// ����� �ִ°�?
		boolean takeUmbrella = false; 	// ����� ����?
		
		
		// 1. �� ���� ����� ������ takeUmbrella�� true��. (�� ���� ����� ������ ����� ����.)
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
			}
		} 
		System.out.println("ù��° ��� : " + takeUmbrella);
		
		// 1-1. ù��° ��츦 And (&&) �����ڷ� ���.
		if(isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		System.out.println("And ���� : " + takeUmbrella);
		
		// 1-2. ù��° ��츦 �������� �����ڷ� ���.
		takeUmbrella = isRaining && haveUmbrella ? true : false;
		
		System.out.println("�������� ���� : " + takeUmbrella);
		
	}

}
