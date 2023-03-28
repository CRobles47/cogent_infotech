package streams;

import java.io.*;

public class ReaderAndWriterDemo {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("C:\\Users\\drzli\\Streams\\abc.txt");
			fw = new FileWriter("C:\\Users\\drzli\\Streams\\msg.txt");
			int ch;
			
			while((ch=fr.read())!=-1) {
				fw.write(ch);
			}
			
			System.out.println("Copied");
			fr.close();
			fw.close();
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
