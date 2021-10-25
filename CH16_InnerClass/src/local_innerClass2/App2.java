package local_innerClass2;

public class App2 {
	
	private String name;
	
	public App2() {
		name = "Äí·çÄí±";
	}

	public static void main(String[] args) {
		App2 app = new App2();
		app.run();

	}
	
	private void run() {
		
		class Printer {
			public void print() {
				System.out.println(App2.this.name);
			}
		}
		
		new Printer().print();
	}

}
