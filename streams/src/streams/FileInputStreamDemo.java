package streams;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File("C://Users//drzli//Streams//dwnjaidh.txt"));
			System.out.println("File is opened");
			int i;
			
			while( (i=fis.read())  != -1 ) {
				System.out.print((char)i);
			}
			
			fis.close();
		} catch (IOException e) {
			System.out.println(e);
		} 
	}

}
