package serialization;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class UserInputStream {

	public static void main(String[] args) {
		boolean finished = false;
		Scanner sc = new Scanner(System.in);
		
		while(!finished) {
			try {
				boolean anotherRecord = true;
				ArrayList<Student> students = new ArrayList<>();;
				
				while(anotherRecord) {
					System.out.println("Enter the student's roll number");
					int rollNo = Integer.parseInt(sc.nextLine());
					System.out.println("Enter the student's name");
					String name = sc.nextLine();
					validateInput(name);
					System.out.println("Enter the student's age");
					int age = Integer.parseInt(sc.nextLine());
					System.out.println("Enter the student's address");
					String addr = sc.nextLine();
					validateInput(name);
				
					students.add(new Student(rollNo, name, age, addr));
					
					System.out.println("Would you like to create another record? Yes or No");
					String response = sc.nextLine();
					
					if(!response.toLowerCase().equals("yes")) {
						anotherRecord=false;
					}
				}
				
				System.out.println("Would you like to write the data into file? Yes or No");
				String response = sc.nextLine();
				
				if(response.toLowerCase().equals("yes")) {
					saveToFile(students);
				}
				finished = true;
			} catch (NumberFormatException e) {
				System.out.println("Roll Number and Age MUST be numeric");
			} catch (BlankInputException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	public static void validateInput(String s) throws BlankInputException{
		if(s.equals("")) {
			throw new BlankInputException("Field cannot be empty");
		}
	}
	
	public static void saveToFile(ArrayList<Student> students) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("C:\\Users\\drzli\\Streams\\Students.ser");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(students);
			System.out.println("Record(s) successfully saved!");
			fos.close();
			oos.close();
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}
