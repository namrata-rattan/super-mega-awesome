package lab2;

public class Lab02_01 {

	public static void main(String[] args) {
System.out.printf("%-15s%15s\n","Celsius","Fahrenheit");


int count = 0;
while (count <= 30) {
	System.out.print("-");
	count++;
	
}
System.out.println();
	int celcius = 0;
	while (celcius <= 10) {
		double fahrenheit = celcius * 9.0 / 5.0 + 32;
		celcius += 2;
		
		System.out.printf("%-15d%15.1f\n",celcius,fahrenheit);
	}
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
