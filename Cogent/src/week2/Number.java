package week2;
import java.util.Scanner;

public class Number {
	int firstNum;
	int secondNum;
	double result;

	public Number(int x, int y) {
		this.firstNum = x;
		this.secondNum = y;
	}
	
	public double getResult() {
		return result;
	}
	
	public void add() {
		this.result = (double)this.firstNum+(double)this.secondNum;
	}
	
	public void sub() {
		this.result = (double)this.firstNum-(double)this.secondNum;
	}
	
	public void mul() {
		this.result = (double)this.firstNum*(double)this.secondNum;
	}
	
	public void div() throws ArithmeticException {
		if(this.secondNum!=0) {
			this.result = (double)this.firstNum/(double)this.secondNum;
		} else {
			throw new ArithmeticException("Cannot divide by zero");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		System.out.println("Please enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Number num = new Number(num1, num2);
		
		do {
			System.out.println("\n*********Menu*********");
			System.out.println("1- Add numbers");
			System.out.println("2- Subtract numbers");
			System.out.println("3- Multiply numbers");
			System.out.println("4- Divide numbers");
			System.out.println("5- Exit\n");
			System.out.println("Please enter your selection");
			choice = sc.nextInt();
			
			
			switch(choice) {
				case 1:
					num.add();
					System.out.println("The result is: " + num.getResult());
					break;
				case 2:
					num.sub();
					System.out.println("The result is: " + num.getResult());
					break;
				case 3:
					num.mul();
					System.out.println("The result is: " + num.getResult());
					break;
				case 4:
					try {
						num.div();
						System.out.println("The result is: " + num.getResult());
					}catch(ArithmeticException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 5:
					break;
			}
			
		} while(choice!=5);
		
	}
}
