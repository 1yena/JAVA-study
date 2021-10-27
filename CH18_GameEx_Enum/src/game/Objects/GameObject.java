package game.Objects;

public enum GameObject {
	
	가위, 바위, 보; //enum의 상수
	
	private int[][] compartison = {
			//		  가위	바위		보
			/*가위*/	{  0,	-1,		1 },
			/*바위*/	{  1,	 0,	   -1 },
			/*보 */	{ -1,	 1,		0 }
	};
	
	public int compare(GameObject ob) {
		return compartison[this.ordinal()][ob.ordinal()];
	}
	
	
}
