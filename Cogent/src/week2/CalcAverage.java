package week2;
import java.util.Scanner;

public class CalcAverage {
	
	public double avgFirstN(int N) throws IllegalArgumentException {
		if(N>0) {
			int sum = 0;
			for(int i=1;i<=N;i++) {
				sum+=i;
			}
			return (double)sum/(double)N;
		}else {
			throw new IllegalArgumentException("Number must be a natural number");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a natural number");
		
		try {
			System.out.println(new CalcAverage().avgFirstN(sc.nextInt()));
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
