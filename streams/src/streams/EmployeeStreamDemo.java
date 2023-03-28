package streams;

import java.io.*;

public class EmployeeStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(new File("C:\\Users\\drzli\\Streams\\employee.txt"));
			
			int i;
			
			while( (i=fis.read()) != -1 ) {
				System.out.print((char)i);
			}
			
			fis.close();
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}
