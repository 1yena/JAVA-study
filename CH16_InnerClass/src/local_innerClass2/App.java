package local_innerClass2;

public class App {
	
	private String name;
	
	public App() {
		name = "����폱";
	}

	public static void main(String[] args) {
		App app = new App();
		app.run();

	}
	
	private void run() {
		
		class Printer {
			public void print() {
				System.out.println(App.this.name);
			}
		}
		
		new Printer().print();
	}

}
