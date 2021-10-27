package throwing_exception;

public class Thermostat {
	
	public void setTemperature(double temperaure) throws Exception {
		
		if(temperaure < 0 || temperaure > 35) {
			//온도값이 비정상으로 여겨서 예외처리한다.
			//throw는 일단 예외를 나중에 처리한다.(이 메소드를 호출할 때 처리함.)
			throw new Exception("온도가 비정상입니다."); 	// 예외를 생성함.
		}
		
		System.out.println("온도 세팅은 : " + temperaure); //온도가 정상일 경우 출력
	}

}
