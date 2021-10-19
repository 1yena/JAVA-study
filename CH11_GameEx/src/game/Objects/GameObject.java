package game.Objects;

public class GameObject {
	
	private int id;
	private String name;
	
	
	private int[][] compartison = {
			//		  ����	����		��
			/*����*/	{  0,	-1,		1 },
			/*����*/	{  1,	 0,	   -1 },
			/*�� */	{ -1,	 1,		0 }
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
		return "GameObject [��ȣ = " + id + ", �� = " + name + "]";
	}
	
}
