package serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadStream {

	public static void main(String[] args) {
		FileInputStream fis;
		ObjectInputStream ois;
		
		try {
			fis = new FileInputStream("C:\\Users\\drzli\\Streams\\Students.ser");
			ois = new ObjectInputStream(fis);
			
			ArrayList<Student> students = new ArrayList<>();
			students = (ArrayList<Student>) ois.readObject();
			
			for(Student s:students) {
				s.printDetails();
			}
			
			fis.close();
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
