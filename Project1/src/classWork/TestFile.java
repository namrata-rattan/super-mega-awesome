package classWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestFile {

	public static void main(String[] args) throws FileNotFoundException {
	
		
		
		
		File sourceFile = new File("src/classWork/SourceFile.txt");
	

		try (PrintWriter output = new PrintWriter(sourceFile);) { //either use this or .close() method at the end 

			output.print("Soumya ");
			output.print("Shastri ");
//			output.close(); // just like a database at the end of all the changes you close the connection/server
			
			output.println(100);
			output.print("Gayu ");
			output.print("Namz");
		}

	}

}