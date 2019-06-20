package classWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadData {



	public static void main(String[] args) throws FileNotFoundException {
		
		
		File parentDir = new File("src/classWork");
		System.out.println(parentDir.exists());
		
		File sourceFile = new File(parentDir, args[0]);
		File destFile = new File(parentDir, args[1]);

		for(int i=0;i<4;i++) {
			System.out.println(args[i]);
		}
		
		if (sourceFile.exists()) {
			System.out.println("The file exists");
		}else System.out.println("doesnt exists");
		
		try (Scanner input = new Scanner(sourceFile);
				PrintWriter output = new PrintWriter(destFile);) {
			while (input.hasNextLine()) {

				String line = input.nextLine();
				String newline = line.replaceAll(args[2], args[3]);

				output.println(newline);

			}
		} 
	}
}