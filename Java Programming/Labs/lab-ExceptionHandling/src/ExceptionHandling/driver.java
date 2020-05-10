package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		
		int number1, number2, division;
		
		try {
			Scanner inputScanner = new Scanner(new FileReader("input.txt"));
			PrintStream ps = new PrintStream("output.txt");
			
			
			while (inputScanner.hasNext()) {
				
				number1 = inputScanner.nextInt();
				number2 = inputScanner.nextInt();
				
				division = number1/number2;
				
				ps.printf("%d / %d = %d\n", number1, number2, division);
				
				inputScanner.nextLine();
				

			}
			
			
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Error!!You can't divide a number by 0!!!");
		}
		
		catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("Error!!This is not an integer!");
		}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error!! File Not Found");
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Undetected Error!!!");
		} 

	}
	
	public void SetMethodException() {
		
		
		
	}
	
	

}
