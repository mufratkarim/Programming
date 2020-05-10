

package Aritra.bcs345.hwk.purchases.presentation;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import Aritra.bcs345.hwk.purchases.business.Address;
import Aritra.bcs345.hwk.purchases.business.Product;

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

	public static void main(String[] args) {
		
		// Automated Testing if all set and get is working in Address Class 
		Address p = new Address();
		String testNumber = "69-85";
		p.setNumber(testNumber);
		
		String testStreet = "192 Street";
		p.setStreet(testStreet);
		
		String testCity = "Queens";
		p.setCity(testCity);
		
		String testState = "New York";
		p.setState(testState);
		
		String testZip = "11212";
		p.setZip(testZip);
		
		// Testing for Number Set & Get
		if (testNumber.equals(p.getNumber())) {
			System.out.println("Address Number Get/Set Name: Pass");
		}
		
		else
		{
			System.out.println("Address Number Get/Set Name: FAIL!");
		}
		
		// Testing for Street Set & Get
		if (testStreet.equals(p.getStreet())) {
			System.out.println("Address Street Get/Set Name: Pass");
		}
		
		else
		{
			System.out.println("Address Street Get/Set Name: FAIL!");
		}
		
		// Testing for City
		if (testCity.equals(p.getCity())) {
			System.out.println("Address City Get/Set Name: Pass");
		}
		
		else
		{
			System.out.println("Address City Get/Set Name: FAIL!");
		}
		
		// Testing for State
		if (testState.equals(p.getState())) {
			System.out.println("Address State Get/Set Name: Pass");
		}
		
		else
		{
			System.out.println("Address State Get/Set Name: FAIL!");
		}
		
		// Testing for Zip
		if (testZip.equals(p.getZip())) {
			System.out.println("Address Zip Get/Set Name: Pass");
		}
		
		else
		{
			System.out.println("Address Zip Get/Set Name: FAIL!");
		}
		
		
		// Automated Testing if get and set is working in Product Class
		Product p2 = new Product();
		String testDescription = "Acer Helios 300";
		p2.setDescription(testDescription);
		
		double testPrice = 1200;
		p2.setPrice(testPrice);
		
		
		// Testing for Description
		if (testDescription.equals(p2.getDescription())) {
			System.out.println("Product Description Get/Set Name: Pass");
		}
		else
		{
			System.out.println("Product Description Get/Set Name: FAIL!");
		}
		
		// Testing for Price
		if (testPrice == p2.getPrice()) {
			System.out.println("Product Price Get/Set Valid Value: Pass");
		} 
		else {
			System.out.println("Product Price Get/Set Valid Value: FAIL!");
		}
		
		// Testing toString Methods
		
		System.out.printf("The toString in Address Prints: %s\n", p.toString());
		System.out.printf("The toString in Product Prints: %s\n", p2.toString());

		


	}

}
