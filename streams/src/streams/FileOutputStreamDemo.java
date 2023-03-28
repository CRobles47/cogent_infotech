package streams;

import java.io.*;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\drzli\\Streams\\abc.txt");
			fos = new FileOutputStream("C:\\Users\\drzli\\Streams\\xyz.txt");
			int data;
			
			while( (data=fis.read()) != -1) {
				fos.write(data);
			}
			
			System.out.println("File copied successfully");
		} catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
