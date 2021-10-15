package test;

public class Stringtest {

	public static void main(String[] args) {

		String text = "I ";
		text += "have ";
		text += "a dog";
		
		System.out.println(text);
		
		StringBuilder sb1 = new StringBuilder();
		
		sb1.append("I ");
		sb1.append("love ");
		sb1.append("a ");
		sb1.append("cat ");
		
		String result1 = sb1.toString();
		System.out.println(result1);
		
		String animal = "cat";
		StringBuilder sb2 = new StringBuilder("we ");
		sb2.append("very ").append("love ").append(animal);
		
		System.out.println(sb2);
		

	}

}
