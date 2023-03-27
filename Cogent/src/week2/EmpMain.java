package week2;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean created = false;
		
		while(!created) {
			try {
				System.out.println("Enter Employee ID");
				int id = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Employee Name");
				String name = sc.nextLine();
				System.out.println("Enter Employee Designation");
				String designation = sc.nextLine();
				System.out.println("Enter Employee Basic");
				double basic = Double.parseDouble(sc.nextLine());
				
				created = attemptEmp(id, name, designation, basic);
			} catch(NumberFormatException e) {
				System.out.println("Please enter a whole number");
			}
		}
	}
	
	public static boolean attemptEmp(int id, String name, String designation, double basic) {
		try {
			Emp emp = new Emp(id, name, designation, basic);
			emp.printDET();
			return true;
		}catch(InvalidDesignation | LowSalException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

}
