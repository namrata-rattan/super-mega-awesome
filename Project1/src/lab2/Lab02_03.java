package lab2;

public class Lab02_03 {

	public static void main(String[] args) {
		final int MAX = 6;
		int count = 0;
		int index = 0;
		while (count < MAX) {
			count++;
			while (index < count) {
				System.out.print("* ");
				index++;
			}
			System.out.println();			
			index = 0;
		}
	}
}