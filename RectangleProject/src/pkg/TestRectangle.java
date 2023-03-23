package pkg;
import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle[] rectangles = new Rectangle[5];
		
		for(int i=0; i<rectangles.length; i++) {
			System.out.println("Enter the length for rectangle number " + (i+1));
			float length = Float.parseFloat(sc.nextLine());
			System.out.println("Enter the breadth for rectangle number " + (i+1));
			float breadth = Float.parseFloat(sc.nextLine());
			
			Rectangle rectangle = new Rectangle(length, breadth);
			rectangles[i] = rectangle;
		}
		
		for(Rectangle r: rectangles) {
			r.display();
		}
	}

}
