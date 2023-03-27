package week2;

public class ErrorDemo {

	public void message() {
		System.out.println("Wish you a very happy birthday!!");
	}
	
	public static void main(String[] args) {
		
		ErrorDemo demo = null;
		demo.message();
		System.out.println("This is the message after the exception");
		
	}
	
}
