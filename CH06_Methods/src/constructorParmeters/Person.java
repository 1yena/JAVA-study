package constructorParmeters;

public class Person {
	
	private String name;
	private double height;
	
	//기본생성자
	public Person() {
		name = "신원미상";
		height = 0.0;
		System.out.println("모르는 사람을 생성!");
	}
	
	//생성자(이름, 키)
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
		System.out.println("한 사람을 생성!");
	}
	
	//get, set 메소드
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
	
	public String toString( ) {
		String text = "이름 : " + name + "," + " 키 : " + height + "cm";
		return text;
	}

}
