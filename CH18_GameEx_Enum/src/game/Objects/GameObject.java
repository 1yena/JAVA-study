package game.Objects;

public enum GameObject {
	
	����, ����, ��; //enum�� ���
	
	private int[][] compartison = {
			//		  ����	����		��
			/*����*/	{  0,	-1,		1 },
			/*����*/	{  1,	 0,	   -1 },
			/*�� */	{ -1,	 1,		0 }
	};
	
	public int compare(GameObject ob) {
		return compartison[this.ordinal()][ob.ordinal()];
	}
	
	
}
