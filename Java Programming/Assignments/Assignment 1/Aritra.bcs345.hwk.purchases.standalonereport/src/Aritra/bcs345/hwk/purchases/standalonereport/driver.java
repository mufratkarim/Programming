/* Mufrat Karim Aritra
Assignment 1
Writing a program that will read data from input file
And create an output file just like how the professor requested */

package Aritra.bcs345.hwk.purchases.standalonereport;

import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		// Insert Input File Name by User with Scanner
		System.out.printf("Enter the Input File Name:\n");
		Scanner input = new Scanner(System.in);
		String InputFileName = input.nextLine();
		
		// Insert Output File Name by User with Scanner
		System.out.printf("Enter the Output File Name:\n");
		Scanner output = new Scanner(System.in);
		String OutputFileName = input.nextLine();
		
		// Creating the a new Class using the template input class 
		input assignmentFile = new input();
		
		// Setting the name of Input and Output File of new class
		assignmentFile.setInputFileName(InputFileName);
		assignmentFile.setOutputFileName(OutputFileName);
		
		// Creating the assignment program with FileCreate Function
		assignmentFile.FileCreate();
	}

}
