package week2;
import java.util.Scanner;

class Arithmetic{
	
	public void division(int x, int y) throws ArithmeticException {
		int z = x/y;
		System.out.println(z);
	}
	
}

public class ExceptionDemo {

	public static void main(String[] args) {
	
		new Arithmetic().division(500, 0);
		System.out.println("After");
		
//		try {
//			new Arithmetic().division(500, 0);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			System.out.println("Finally block");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Please enter two numbers:");
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		try {
//			int z = x/y;
//			System.out.println(z);
//		}catch(ArithmeticException e) {
//			System.out.println("Division by zero is not allowed.");
//		}
//		System.out.println("Welcome!!!");
		
//		try {
//			String input = args[0];
//			System.out.println(input);
//			int output = Integer.parseInt(input);
//			System.out.println("Output is: " + output);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			System.out.println("finally will work in both cases!");
//		}
	}

}
