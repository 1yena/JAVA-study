package application;

public class Cat {
	
	private String name; //����� �̸�
	
	public  static final String FOOD = "����� ���"; //final�� ���(������ �ʴ� ��)
	
	//static ������ ��ü���� ���� ������.
	private static int count = 0; //������ ������� ����
	
	public Cat(String name) { //�����ڴ� return Ÿ���� ����(�Ϲ� �޼ҵ�� �ٸ�)
		this.name = name;
		count++; //����� ��ü ���� �� static count�� +1�� �ȴ�.
	}

	@Override
	public String toString() {
		return "Cat [�̸� = " + name + "]";
	}
	
	public static int getCount() { 
		//String n = name; => static �޼ҵ�� �ν��Ͻ�(��ü) ������ ����� �� ����.
		return count;
	}
	
}
		


