package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) {
		FileInputStream fis;
		ObjectInputStream ois;
		
		try {
			fis = new FileInputStream("C:\\Users\\drzli\\Streams\\Emp.ser");
			ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			Employee emp = (Employee)obj;
			System.out.println("Employee ID: " + emp.id);
			System.out.println("Employee Name: " + emp.name);
			System.out.println("Employee Salary: " + emp.salary);
			System.out.println("Employee SSN: " + emp.ssn);
			
			fis.close();
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
