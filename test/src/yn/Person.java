package yn;


public class Person {
	private String name;
	private double height;
	
	public Person() {
		name = "신원미상";
		height = 0.0;
		System.out.println("모르는 사람을 생성!");
	}
	
	public Person (String name, double height) {
		this.name = name;
		this.height = height;
		System.out.println("누군가를 생성 !");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	

}
