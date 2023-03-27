package week2;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean created = false;
		
		while(!created) {
			System.out.println("Enter Employee ID");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("Enter Employee Name");
			String name = sc.nextLine();
			System.out.println("Enter Employee Designation");
			String designation = sc.nextLine();
			System.out.println("Enter Employee Basic");
			double basic = Double.parseDouble(sc.nextLine());
			
			try {
				Emp emp = new Emp(id, name, designation, basic);
				emp.printDET();
				created = true;
			}catch(InvalidDesignation | LowSalException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}
