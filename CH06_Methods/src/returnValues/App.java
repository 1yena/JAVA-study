package returnValues;

public class App {

	public static void main(String[] args) {
		// 메소드의 리턴
		
		ReturnValue value1 = new ReturnValue();
		
		value1.getAnimal();
		
		System.out.println(value1.getAnimal());
		
		String ani = value1.getAnimal(); //"ani"라는 변수에 "value1.getAnimal()" 넣음.
		
		System.out.println(ani);

	}

}
