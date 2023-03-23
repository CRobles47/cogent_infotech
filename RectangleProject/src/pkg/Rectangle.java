package pkg;

public class Rectangle {
	private float length;
	private float breadth;
	
	public Rectangle() {
		this.length = 0;
		this.breadth = 0;
	}
	
	public Rectangle(float len, float bre) {
		this.length = len;
		this.breadth = bre;
	}
	
	public float calcArea() {
		return this.length * this.breadth;
	}
	
	public void display() {
		System.out.println("Rectangle information:");
		System.out.println("The length of this rectangle is: " + this.length);
		System.out.println("The breadth of this rectangle is: " + this.breadth);
		System.out.println("The area of this rectangle is: " + calcArea());
	}
}
