package lab1;

public class Lab01_05 {

	public static void main(String[] args) {
	
	double km = 24 * 1.6;
	System.out.println(km);
	double time = 1.0 + 40.0 / 60.0 + 35.0/ (60.0 * 60.0);
	
	double speed = km / time;
    System.out.printf("the average speed is %.2f km/hr\n", speed);
	}

}
