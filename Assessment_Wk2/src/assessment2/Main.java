package assessment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		EmployeeDAOIMPL dao = new EmployeeDAOIMPL();
		Scanner sc = new Scanner(System.in);
		boolean finished = false;
		int choice = 0;
		
		while(!finished) {
			
			try {
				System.out.println("\n**********Main Menu**********");
				System.out.println("1- Create Employee");
				System.out.println("2- Update Employee");
				System.out.println("3- Delete Employee");
				System.out.println("4- Print Employees");
				System.out.println("5- Find Employee");
				System.out.println("6- Sort Employees");
				System.out.println("7- Exit");
				System.out.println("Please enter your choice");
				choice = Integer.parseInt(sc.nextLine());
				InvalidSelectionException.validateSelection(choice, 1, 7);
				
				switch(choice) {
					case 1:
						dao.createEmployee(employees);
						break;
					case 2:
						dao.updateEmployee(employees);
						break;
					case 3:
						dao.deleteEmployee(employees);
						break;
					case 4:
						dao.printEmployees(employees);
						break;
					case 5:
						dao.findEmployee(employees);
						break;
					case 6:
						dao.sortEmployees(employees);
						break;
					case 7:
						finished=true;
						break;
				}
			} catch(NumberFormatException e) {
				System.out.println("Input must be numeric");
			} catch(InvalidSelectionException e) {
				System.out.println(e.getMessage());
			}	
		}	
	}
}
