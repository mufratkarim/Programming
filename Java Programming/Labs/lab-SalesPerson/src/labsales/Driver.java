package labsales;

import java.io.FileReader;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		try {
			Scanner inputFileScanner;
			inputFileScanner = new Scanner(new FileReader("input.txt"));
			String name;
			double sales;
			
			while (inputFileScanner.hasNext()) {
				name = inputFileScanner.next();
				sales = inputFileScanner.nextDouble();
				inputFileScanner.nextLine();
			
				SalesPerson mainSales = new SalesPerson();
				mainSales.setName(name);
				mainSales.setSales(sales);
		
				System.out.printf("\nName: %s\n", name);
				mainSales.statusMessage();
			}
		}
		catch (Exception e) {
			System.out.printf("Error has occurred");
		}
		
	}
	
	

}
