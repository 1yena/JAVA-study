package application;

public class For {

	public static void main(String[] args) {
		// for �ݺ��� for(�ʱⰪ;����;����) { ��ɹ�; }
		
		/* �ʱⰪ,����,���� �ƹ��͵� ������ ���ѹݺ�
		for(;;) {
			System.out.println("���ѹݺ�");
		*/
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			System.out.println(sum = sum+i);
			
		}
		/* int sum = 0;
		for(int i=1; i<=100; i++) {
			sum = sum+i; 
		System.out.println(sum);
			*/
		
		/* int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i; 
		System.out.println(sum)
			*/
		
	}
}