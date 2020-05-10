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
		
		CustomerPurchaseConsoleUI menu = new CustomerPurchaseConsoleUI();
		
		menu.ShowUI();
		
		
	}

}

