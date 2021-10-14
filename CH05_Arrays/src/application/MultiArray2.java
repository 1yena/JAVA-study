package application;

public class MultiArray2 {

	public static void main(String[] args) {
		// ÀÌÁß¹è¿­
		
		String[][] texts = {
				
				{"ÇÏ³ª","µÑ","¼Â"},
				{"³İ","´Ù¼¸","¿©¼¸"},
				{"ÀÏ°ö","¿©´ü","¾ÆÈ©"},
				{"ÄíÄí","·ç","»æ»Í"},
				
		};
		
		for(int i=0; i<texts.length; i++) {
		
			for(int j=0; j<texts[i].length; j++) {
				System.out.printf("%s\t", texts[i][j]);
			}
		
		System.out.println();
		
		}
		
	}
}
