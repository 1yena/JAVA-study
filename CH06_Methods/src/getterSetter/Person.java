package getterSetter;

public class Person {
	
	private String name;
	private int age;
	
	//get, set �޼ҵ�� ������ ����
	// set:�Է�, get:�������� => �� �ܾ� �ڿ� ù���ڸ� �빮�ڷ� �����ָ� ��.
		void setName(String name) {
			this.name = name;		 // this�� �ν��Ͻ�
		}
		
		String getName() {
			return name;
		}
		
		void setAge(int age) {
			this.age = age;
		}
		
		int getAge() {
			return age;
		}
	
	}
