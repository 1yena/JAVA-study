package application;

public class Final {

	public static void main(String[] args) {
		// final 초기화한 값이 상수가 됨 (수정 불가)
		
		final int VALUE = 9;
		//VALUE = 10; 다른 값으로 초기화 안 됨(에러 발생)
		
		System.out.println(VALUE);
		
		final String USER_PASSWORD = "abc";
		//USER_PASSWORD = "ABC"; 다른 값으로 초기화 안 됨(에러 발생)
		
		System.out.println(USER_PASSWORD);		
		

	}

}
