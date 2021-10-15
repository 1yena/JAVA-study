package getterSetter;

public class Person {
	
	private String name;
	private int age;
	
	//get, set 메소드로 변수에 접근
	// set:입력, get:가져오기 => 각 단어 뒤에 첫글자를 대문자로 적어주면 됨.
	public void setName(String name) {
			this.name = name;		 // this는 인스턴스
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
