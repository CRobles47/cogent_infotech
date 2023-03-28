package serialization;

import java.io.*;

public class SerializationDemo {

	public static void main(String[] args) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try {
			fos = new FileOutputStream("C:\\Users\\drzli\\Streams\\Emp.ser");
			oos = new ObjectOutputStream(fos);
			
			Employee emp = new Employee(1, "John", 10000, 12345);
			oos.writeObject(emp);
			System.out.println("Object serialized!");
			fos.close();
			oos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
