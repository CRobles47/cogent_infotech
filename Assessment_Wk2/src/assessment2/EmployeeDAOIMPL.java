package assessment2;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeDAOIMPL implements EmployeeDAO{
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void createEmployee(List<Employee> employees) {
		boolean created = false;
		
		while(!created) {
			try {
				System.out.println("Enter the Employee No.");
				int empNo = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the Employee Name");
				String empName = sc.nextLine();
				BlankInputFieldException.checkIfEmpty(empName);
				System.out.println("Enter the Employee Address");
				String empAddr = sc.nextLine();
				BlankInputFieldException.checkIfEmpty(empAddr);
				System.out.println("Enter the Employee Email");
				String empEmail = sc.nextLine();
				BlankInputFieldException.checkIfEmpty(empEmail);
				System.out.println("Enter the Employee Salary");
				double empSal = Double.parseDouble(sc.nextLine());
				
				employees.add(new Employee(empNo, empName, empAddr, empEmail, empSal));
				created = true;
			} catch(NumberFormatException e) {
				System.out.println("Input must be numeric");
			} catch(BlankInputFieldException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	@Override
	public void updateEmployee(List<Employee> employees) {
		boolean empFound = false;
		boolean finished = false;
		int choice = 0;
		Employee employee = null;
		
		
		try {
			System.out.println("Enter the Employee No. of the Employee you wish to update");
			int empNo = Integer.parseInt(sc.nextLine());
			for(Employee emp: employees) {
				if(emp.getEmployeeNo()==empNo) {
					empFound = true;
					employee = emp;
				}
			}
		} catch(NumberFormatException e) {
			System.out.println("Input must be numeric");
		}
		
		if(empFound) {
			while(!finished) {
				try {
					System.out.println("\nWhat would you like to update?");
					System.out.println("1- Employee Number");
					System.out.println("2- Employee Name");
					System.out.println("3- Employee Address");
					System.out.println("4- Employee Email");
					System.out.println("5- Employee Salary");
					System.out.println("6- Return to Main Menu");
					choice = Integer.parseInt(sc.nextLine());
					InvalidSelectionException.validateSelection(choice, 1, 6);
					
					switch(choice) {
						case 1:
							System.out.println("Enter new Employee No.");
							int empNo = Integer.parseInt(sc.nextLine());
							employee.setEmployeeNo(empNo);
							break;
						case 2:
							System.out.println("Enter new Employee Name");
							String empName = sc.nextLine();
							BlankInputFieldException.checkIfEmpty(empName);
							employee.setEmployeeName(empName);
							break;
						case 3:
							System.out.println("Enter new Employee Address");
							String empAddr = sc.nextLine();
							BlankInputFieldException.checkIfEmpty(empAddr);
							employee.setEmployeeAddress(empAddr);
							break;
						case 4:
							System.out.println("Enter new Employee Email");
							String empEmail = sc.nextLine();
							BlankInputFieldException.checkIfEmpty(empEmail);
							employee.setEmployeeEmail(empEmail);
							break;
						case 5:
							System.out.println("Enter new Employee Salary");
							double empSal = Double.parseDouble(sc.nextLine());
							employee.setEmployeeSalary(empSal);
							break;
						case 6:
							finished=true;
							break;
					}
				} catch(NumberFormatException e) {
					System.out.println("Input must be numberic");
				} catch(InvalidSelectionException e) {
					System.out.println(e.getMessage());
				} catch(BlankInputFieldException e) {
					System.out.println(e.getMessage());
				}
			}
		} else {
			System.out.println("Employee Not Found");
		}
	}
	
	@Override
	public void deleteEmployee(List<Employee> employees) {
		boolean empFound = false;
		
		try {
			System.out.println("Enter the Employee No. of the Employee you wish to delete");
			int empNo = Integer.parseInt(sc.nextLine());
			
			Iterator<Employee> itr = employees.iterator();
			
			while(itr.hasNext()) {
				if(itr.next().getEmployeeNo()==empNo) {
					empFound = true;
					itr.remove();
				}
			}
		} catch(NumberFormatException e) {
			System.out.println("Input must be numeric");
		}
		
		if(empFound) {
			System.out.println("Employee successfully deleted!");
		} else {
			System.out.println("Employee not found.");
		}
	}
	
	@Override
	public void printEmployees(List<Employee> employees) {
		
		System.out.println("Employees currently in list\n");
		for(Employee emp:employees) {
			System.out.println("\n\tEmployee Number: " + emp.getEmployeeNo());
			System.out.println("\tEmployee Name: " + emp.getEmployeeName());
			System.out.println("\tEmployee Address: " + emp.getEmployeeAddress());
			System.out.println("\tEmployee Email: " + emp.getEmployeeEmail());
			System.out.println("\tEmployee Salary: " + emp.getEmployeeSalary());
		}
	}
	
	@Override
	public void findEmployee(List<Employee> employees) {
		boolean empFound = false;
		
		try {
			System.out.println("Enter the name of the Employee you want to find");
			String empName = sc.nextLine();
			BlankInputFieldException.checkIfEmpty(empName);
			
			Iterator<Employee> itr = employees.iterator();
			
			while(itr.hasNext()) {
				if(itr.next().getEmployeeName().toLowerCase().equals(empName.toLowerCase())) {
					empFound = true;
				}
			}
			
			if(empFound) {
				System.out.println("Employee Found");
			} else {
				System.out.println("Employee Not Found.");
			}
		} catch(BlankInputFieldException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Override
	public void sortEmployees(List<Employee> employees) {
		employees.sort(new EmployeeNameComparator());
	}
	
}
