package labsales;

import java.util.Scanner;

public class SalesPerson {
	//Variables
	private String name;
	private double sales;
	
	//Getter
	public String getName() {
		return name;
	}
	public double getSales() {
		return sales;
	};
	
	//Setter
	public void setName(String setName) {
		name = setName;
	}
	public void setSales(double sales2) {
		sales = sales2;
	}
	
	//StatusMessage Method
	public void statusMessage() {
		if (sales >= 100) {
			System.out.printf("Performing Well");
		}
		else {
			System.out.printf("Not meeting expectations");	
		}
	}
	
	// Method QuotaDifference
	//public void QuotaDifference() {
		//Scanner input = new Scanner(System.in);
		//name = input.nextLine();
		//sales = input.nextInt();
	//}
}