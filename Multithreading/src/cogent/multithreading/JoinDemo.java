package cogent.multithreading;

import java.util.Scanner;

public class JoinDemo extends Thread {
	static int n,sum=0;
	
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		System.out.println("Sum of 'N' numbers: ");
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		JoinDemo.n=sc.nextInt();
		
		JoinDemo jd=new JoinDemo();
		jd.start();
		
		try {
			jd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Sum of first " + JoinDemo.n+ " Number is " + JoinDemo.sum);
		long end = System.currentTimeMillis();
		System.out.println("The total time taken is: " + (end-start)/1000 + " seconds");
	}
	
	@Override
	public void run() {
		for(int i=1; i<=JoinDemo.n; i++) {
			JoinDemo.sum+=i;
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
