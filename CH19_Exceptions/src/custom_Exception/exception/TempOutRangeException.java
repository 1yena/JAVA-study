package custom_Exception.exception;

// 온도가 낮거나 너무 높을 경우 발생하는 예외의 상위클래스
public class TempOutRangeException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public TempOutRangeException(String message) {
		// 생성자 예외 메세지를 상위 예외클래스에 처리
		super(message); 	// 예외클래스에서 메세지명으로 예외를 생성
		
	}

}
