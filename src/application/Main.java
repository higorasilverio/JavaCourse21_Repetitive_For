package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Enter the quantity of divisions: ");
		int control = scanner.nextInt();
		System.out.println();
		for  (int i = 0; i < control; i++) {
			System.out.print("Enter the dividend: ");
			double dividend = scanner.nextDouble();
			System.out.print("Enter the divider: ");
			double divider = scanner.nextDouble();
			if (divider != 0) {
				double quotient = dividend / divider;
				System.out.printf("%.1f\n\n", quotient);
			}
			else System.out.printf("Imposible division!\n\n");
		}
		
		scanner.close();
		
	}

}
