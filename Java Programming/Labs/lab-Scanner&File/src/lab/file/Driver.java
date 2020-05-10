package lab.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int num1, num2;
		Scanner input = new Scanner(System.in);
		
		String fileName = "data.txt";
		Scanner inputScanner = null;
		
		try {
			inputScanner = new Scanner(new FileReader(fileName));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		num1= inputScanner.nextInt();
		num2= inputScanner.nextInt();
		
		//System.out.printf("num1 is %d\nnum2 is %d\n", num1, num2);
		try {
			PrintStream ps = new PrintStream("MufratKarimFirstLab.txt");
			ps.printf("num1 is %d\nnum2 is %d\n", num1, num2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
