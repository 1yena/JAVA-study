package throwing_exception;

public class Thermostat {
	
	public void setTemperature(double temperaure) throws Exception {
		
		if(temperaure < 0 || temperaure > 35) {
			//�µ����� ���������� ���ܼ� ����ó���Ѵ�.
			//throw�� �ϴ� ���ܸ� ���߿� ó���Ѵ�.(�� �޼ҵ带 ȣ���� �� ó����.)
			throw new Exception("�µ��� �������Դϴ�."); 	// ���ܸ� ������.
		}
		
		System.out.println("�µ� ������ : " + temperaure); //�µ��� ������ ��� ���
	}

}
