package constructors;

public class Person {
	//변수
	private String name;
	private double height;
	
	//생성자
	public Person() {
		//기본생성자 : 생략가능하며 매개변수 없음
		System.out.println("한 사람을 생성!");
	} // 이게 없으면 객체만 생성됨.
	
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

}
