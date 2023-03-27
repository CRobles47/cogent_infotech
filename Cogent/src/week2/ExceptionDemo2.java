package week2;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		String[] names = {"Shiva", "John", "Anthony", "Sophia"};
		
		try {
			System.out.println(names[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Trying to access element out of array range");
		}
		System.out.println("After exception");
	}

}
