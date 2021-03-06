package custom_Exception;

import custom_Exception.exception.TempTooHightException;
import custom_Exception.exception.TempTooLowException;

public class Thermostat {
	
	public void setTemperature(double temperature) throws TempTooHightException, TempTooLowException {
		setMachineTemperature(temperature);
		
		System.out.println("온도 세팅 : " + temperature); 		// 온조가 정상일 경우 출력
	}

	private void setMachineTemperature(double temperature) throws TempTooHightException, TempTooLowException {
		if (temperature < 0) {
			throw new TempTooLowException("온도가 너무 낮습니다."); // 예외를 생성함
		} else if (temperature > 35) {
			throw new TempTooHightException("온도가 너무 높습니다.");	// 예외를 생성함
		}
		
	}
	
	

}
