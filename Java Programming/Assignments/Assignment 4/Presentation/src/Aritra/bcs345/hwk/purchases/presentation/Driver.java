package Aritra.bcs345.hwk.purchases.presentation;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import Aritra.bcs345.hwk.purchases.business.Address;
import Aritra.bcs345.hwk.purchases.business.Product;
import Aritra.bcs345.hwk.purchases.business.Customer;
import Aritra.bcs345.hwk.purchases.business.Purchase;

/**
 * Contains main program code. This class generates the main class of the presentation 
 * package of assignment2.
 * 
 * @author Mufrat Karim Aritra
 * @version 1.0
 * @since 9/27/2019
 *
*/

public class Driver {
	/**
     * This is the starting point for the program.
     * @param args
     */
	public static void main(String[] args) {
		
		System.out.printf("%-10s\n%-10s\n", "Choose UI", "---------");
		System.out.printf("1 –  CustomerPurchaseConsoleUI\n"
				+ "2 –  PurchaseCollectionConsoleUI\n"
				+ "3 –  Exit\n" + 
				"Enter Choice:\n");
		
		Scanner input = new Scanner(System.in);
		int option = input.nextInt();
		
		while (option != 1 && option != 2 && option != 3) {
			
			System.out.printf("%-10s\n%-10s\n", "Choose UI", "---------");
			System.out.printf("Incorrect input. Enter 1 or 2: \n");
			input = new Scanner(System.in);
			option = input.nextInt();
			
		}
		
		if (option == 1) {
			
			CustomerPurchaseConsoleUI menu = new CustomerPurchaseConsoleUI();
			menu.ShowUI();
				
		}
		
		else if (option == 2) {
			
			PurchaseCollectionConsoleUI menu2 = new PurchaseCollectionConsoleUI();
			menu2.ShowUI();
		}
		
		else if (option == 3) {
			
			System.out.printf("Successfully Exited");

		}
		
	}

}

