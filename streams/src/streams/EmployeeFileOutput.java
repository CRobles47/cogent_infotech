package streams;

import java.io.*;

public class EmployeeFileOutput {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		int data;
		
		try {
			fis = new FileInputStream("C:\\Users\\drzli\\Streams\\employee.txt");
			fos = new FileOutputStream("C:\\Users\\drzli\\Streams\\newEmployee.txt");
			
			while( (data=fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("File copied");
			
			fis.close();
			fos.close();
		} catch(IOException e) {
			System.out.println(e);
		}

	}

}
