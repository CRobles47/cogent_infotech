package streams;

import java.io.*;
import java.util.Scanner;

public class CommandLineIO {

	public static void main(String[] args) {
		
		if(args.length == 2) {
			FileInputStream fis = null;
			FileOutputStream fos = null;
			
			try {
				fis = new FileInputStream(args[0]);
				int data;
				
				if(new File(args[1]).exists()) {
					Scanner sc = new Scanner(System.in);
					System.out.println("Would you like to overwrite destination file? Yes or No");
					String response = sc.nextLine();
					
					if(response.toLowerCase().equals("yes")) {
						fos = new FileOutputStream(args[1]);
						
						while((data=fis.read())!=-1) {
							fos.write(data);
						}
						System.out.println("File overwritten succesfully!");
					}
				} else {
					fos = new FileOutputStream(args[1]);
					
					while((data=fis.read())!=-1) {
						fos.write(data);
					}
					System.out.println("New file created!");
				}
			} catch(IOException e) {
				System.out.println(e);
			}	
		} else {
			System.out.println("Please provide two filenames");
		}
		
	}
}
