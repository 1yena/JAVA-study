package game.Objects;

public class GameObject {
	
	private int id;
	private String name;
	
	
	private int[][] compartison = {
			//		  가위	바위		보
			/*가위*/	{  0,	-1,		1 },
			/*바위*/	{  1,	 0,	   -1 },
			/*보 */	{ -1,	 1,		0 }
	};
	
	public int compare(GameObject ob) {
		return compartison[id][ob.id];
	}
	
	
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "GameObject [번호 = " + id + ", 손 = " + name + "]";
	}
	
}
