package returnValues;

public class App {

	public static void main(String[] args) {
		// �޼ҵ��� ����
		
		ReturnValue value1 = new ReturnValue();
		
		value1.getAnimal();
		
		System.out.println(value1.getAnimal());
		
		String ani = value1.getAnimal(); //"ani"��� ������ "value1.getAnimal()" ����.
		
		System.out.println(ani);

	}

}