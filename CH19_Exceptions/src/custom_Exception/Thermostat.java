package custom_Exception;

import custom_Exception.exception.TempTooHightException;
import custom_Exception.exception.TempTooLowException;

public class Thermostat {
	
	public void setTemperature(double temperature) throws TempTooHightException, TempTooLowException {
		setMachineTemperature(temperature);
		
		System.out.println("�µ� ���� : " + temperature); 		// ������ ������ ��� ���
	}

	private void setMachineTemperature(double temperature) throws TempTooHightException, TempTooLowException {
		if (temperature < 0) {
			throw new TempTooLowException("�µ��� �ʹ� �����ϴ�."); // ���ܸ� ������
		} else if (temperature > 35) {
			throw new TempTooHightException("�µ��� �ʹ� �����ϴ�.");	// ���ܸ� ������
		}
		
	}
	
	

}
