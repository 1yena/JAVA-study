package super_Constructor;

public class Test {
	String name;

	public Test(String name) {
		super(); //모든 object 클래스가 상위 생성자이기 때문에 기본적으로 생략되어 있음.
		this.name = name;
	}
}
