package Aritra.bcs345.hwk.purchases.standalonereport;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class input {
	// Variables
	private String InputFileName, OutputFileName, FirstName, LastName, Street, City, State, ProductName;
	private double ProductPrice, Cost, TotalCost = 0;
	// To convert all the doubles into two digits(.00) using DecimalFormat
	DecimalFormat df = new DecimalFormat("$#,###.00");
	private int ZipCode, HouseNumber, ProductQuantity, TotalQuantity = 0;
	
	
	// Setter and getter for InputFile
	void setInputFileName(String i) {
		InputFileName = i;
	}
	String getInputFileName() {
		return InputFileName;
	}
	
	// Setter and getter for OutputFile
	void setOutputFileName(String o) {
		OutputFileName = o;
	}
	String getOutputFileName() {
		return OutputFileName;
	}
	
	// Function that will read data from input file
	// And also write a report to an output file
	public void FileCreate() {
	
		// Reading the data from Input File
		try {
			// Receiving the input filename with getter
			Scanner inputFile = new Scanner(new FileReader(getInputFileName()));
			
			// Assigning all the variables with the scanner
			FirstName = inputFile.nextLine();
			LastName = inputFile.nextLine();
			HouseNumber = inputFile.nextInt();
			// System.out.println(HouseNumber); // Dummy Code, Checking I am assigning variable properly
			Street = inputFile.nextLine();
			City = inputFile.nextLine();
			State = inputFile.nextLine();
			inputFile.nextLine();
			ZipCode = inputFile.nextInt();
			// System.out.println(ZipCode); // Dummy Code, Checking I am assigning variable properly
			inputFile.nextLine();

			
			
			// Storing the report to an output file using PrintStream
		 	PrintStream ps = null;
		    	
		    	try
		    	{
		    		// Receiving the output filename with getter
		    		ps = new PrintStream(getOutputFileName());
			}
		    	catch (Exception e)
		    	{
		    		System.out.println("ERROR. Could not open file!");
		    	}
		
			ps.printf("Purchase Report\n---------------\n%s %s\n%d %s\n%s, %s %d\n\n", FirstName, LastName, HouseNumber, Street, City, State, ZipCode);
			ps.printf("%-30s %15s %10s %15s\n", "Description", "Price", "Quantity", "Cost");
			ps.printf("%-30s %15s %10s %15s\n", "-----------", "-----", "--------", "----");
			
			
			// Creating a loop so that we can put unlimited products under the person
			while (inputFile.hasNext()) {
				
				ProductName = inputFile.nextLine();
				// System.out.println(ProductName); // Dummy Code, Checking I am assigning variable properly
				ProductPrice = inputFile.nextDouble();
				// System.out.println(ProductPrice); // Dummy Code, Checking I am assigning variable properly
				
				ProductQuantity = inputFile.nextInt();
				// Assigning Total Quantity so that we can get a value at the end
				TotalQuantity +=ProductQuantity;
				// System.out.println(ProductQuantity); // Dummy Code, Checking I am assigning variable properly
				
				Cost = ProductPrice * ProductQuantity;
				// Assigning totalCost so that we can get a value at the end
				TotalCost += Cost;
				
				// System.out.println(Cost); // Dummy Code, Checking if I am assigning cost properly
				
				ps.printf("%-30s %15s %10d %15s\n", ProductName, df.format(ProductPrice), ProductQuantity, df.format(Cost));
				

			      if(inputFile.hasNext()) {
			    	  inputFile.nextLine();
			      }
			      
			}
			
			// System.out.println(TotalCost); // // Dummy Code, Checking if I am assigning totalCost properly
			// System.out.println(TotalQuantity); // Dummy Code, Checking I am assigning totalQuantity properly
			
			// Printing the output on the file after the loop is finished
			ps.printf("%-30s %15s %10s %15s\n", "-----------", "-----", "--------", "----");
			ps.printf("%-30s %15s %10s %15s\n", "Total", " ", TotalQuantity, df.format(TotalCost));
			
			
		} 	catch (FileNotFoundException e) {
			System.out.printf("File Naming/Formatting Error!");
		}


	}
	
}
