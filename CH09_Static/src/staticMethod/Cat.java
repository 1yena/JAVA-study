package staticMethod;

public class Cat {
	
	private String name; //����� �̸�
	private int id; //����� ���̵�
	
	public  static final String FOOD = "����� ���"; //final�� ���(������ �ʴ� ��)
	
	//static ������ ��ü���� ���� ������.
	private static int count = 0; //������ ������� ����
	
	public Cat(String name) { //�����ڴ� return Ÿ���� ����(�Ϲ� �޼ҵ�� �ٸ�)
		this.name = name;
		
		//id = count; 	//����� �ڵ� ������ ���̵� 0������ ���
		count++; 		//����� ��ü ���� �� static count�� +1�� �ȴ�.
		id = count; 	//����� �ڵ� �߰� ������ ���̵� 1������ ���
	}

	@Override
	public String toString() {
		return "����� [���̵� ="+id + ", �̸� = " + name + "]";
	}
	
	public static int getCount() { 
		//String n = name; => static �޼ҵ�� �ν��Ͻ�(��ü) ������ ����� �� ����.
		return count;
	}
	
}
		


