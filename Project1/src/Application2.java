import java.util.Scanner;

// Do While loop example
public class Application2 {

	public static void main(String[] args) {
		
		Scanner saku = new Scanner(System.in);
		
		int value = 0;
		
		do
		{
		
		System.out.println("Enter a number ");
		value = saku.nextInt();
		
		
		}
		while ( value != 5 );
		
		System.out.println("got 5!");
		
		
	}

}




