package constructors;

public class Person {
	//����
	private String name;
	private double height;
	
	//������
	public Person() {
		//�⺻������ : ���������ϸ� �Ű����� ����
		System.out.println("�� ����� ����!");
	} // �̰� ������ ��ü�� ������.
	
	//get, set �޼ҵ�
	public void setName(String name) {
			this.name = name;		
		}
	public String getName() {
			return name;
		}
	public void setHtight(double height) {
		this.height = height;
	}
	public double getHtight() {
		return height;
	}	

}
