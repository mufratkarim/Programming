package lab_YearlySales;

import java.io.PrintStream;

public class YearlySales {
	
	private double[] salesData;
	
	
	public YearlySales() {
		salesData = new double[12];
	}
	
	double get(int monthNum) {
		
		int index = monthNum - 1;
		
		return salesData[index];
		
	}
	
	void set(int monthNum, double amount) {
		
		int index = monthNum - 1;
		salesData[index] = amount;
	}
	
	public double average() {
		
		double total = 0.0;
		double average;
		// Total
		
		for (int i = 0; i < salesData.length; i++) {
			
			total += salesData[i];
		}
		
		// Average
		
		average = total/salesData.length;
		
		return average;
		
	}
	



	
	/*void ShowReport() {
		
		PrintStream ps = new PrintStream();
		
		ps.printf("%s\t%d", )
	}
	
	*/
}
