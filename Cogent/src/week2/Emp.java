package week2;

public class Emp {
	private int empId;
	private String empName;
	private String designation;
	private double basic;
	private final double hra;
	
	public Emp(int id, String name, String des, double basic) throws InvalidDesignation, LowSalException{
		this.empId = id;
		this.empName = name;
		if(des.toLowerCase().equals("manager") || des.toLowerCase().equals("officer") || des.toLowerCase().equals("clerk")) {
			this.designation = des;
		} else {
			throw new InvalidDesignation("Invalid designation. Must be Manager, Officer, or Clerk.");
		}
		if(basic>=500) {
			this.basic = basic;
		} else {
			throw new LowSalException("Salary is too low");
		}
		this.hra = this.calculateHRA();
	}
	
	public void printDET() {
		System.out.println("Employee ID: " + this.empId);
		System.out.println("Employee Name: " + this.empName);
		System.out.println("Employee Designation: " + this.designation);
		System.out.println("Employee Basic: " + this.basic);
		System.out.println("Employee HRA: " + this.hra);
	}
	
	public double calculateHRA() {
		if(this.designation.toLowerCase().equals("manager")) {
			return this.basic*0.10;
		} else if(this.designation.toLowerCase().equals("officer")) {
			return this.basic*0.12;
		} else {
			return this.basic*0.05;
		}
	}
	
}
