package application;

public class Break {

	public static void main(String[] args) {
		// break �ݺ��� �ȿ��� ���� �ݺ����� ��������.
		
		int count = 0;
		while (true) {
			
			System.out.println("���." + count);
			
			if (count == 5) { //count�� 5�� �Ǹ�
				break;		  //�ݺ����� ��������.
				
			}
			
			System.out.println("how are you");
			System.out.println("z" + count);
			count++;
		}
		
		System.out.println("program finished");

	}

}

// [if (count == 5) break;]
// ��ù��� �� �� �� ���� �� ������ ����.
