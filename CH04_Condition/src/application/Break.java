package application;

public class Break {

	public static void main(String[] args) {
		// break �ݺ��� �ȿ��� ���� �ݺ����� ��������.
		
		int count = 0;
		while (true) {
			
			System.out.println("���." + count);
			System.out.println("how are you");
			System.out.println("z" + count);
			count++;
			
			if (count == 5) { 
				break;		  //count�� 5�� �Ǹ� �ݺ����� ��������.
			}
			
		}
		
		System.out.println("program finished");

	}

}

// [if (count == 5) break;]
// ��ù��� �� �� �� ���� �� ������ ����.
