package collections;



public class Wrapper<E> {	// "E"는 물음표와 같음.
	
	private E object;
	
	public void set(E object) {
		this.object = object;
	}
	public E get() {
		return object;
	}

}
