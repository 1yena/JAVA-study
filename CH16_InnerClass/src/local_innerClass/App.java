package local_innerClass;

public class App {
	
	private String name;
	
	public App() {
		name = "������";
	}

	public static void main(String[] args) {
		App app = new App();
		app.run();

	}
	
	private void run() {
		
		class Printer {
			public void print() {
				System.out.println(name);
			}
		}
		
		new Printer().print();
	}

}
