package getterSetter;

public class Person {
	
	private String name;
	private int age;
	
	//get, set �޼ҵ�� ������ ����
	// set:�Է�, get:�������� => �� �ܾ� �ڿ� ù���ڸ� �빮�ڷ� �����ָ� ��.
	public void setName(String name) {
			this.name = name;		 // this�� �ν��Ͻ�
		}
		
	public String getName() {
			return name;
		}
		
	public void setAge(int age) {
			this.age = age;
		}
		
	public int getAge() {
			return age;
		}
	
	}
