/**
 * Contains a class to generate the Customer Purchase menu
 */

package Aritra.bcs345.hwk.purchases.presentation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

import Aritra.bcs345.hwk.purchases.business.Customer;
import Aritra.bcs345.hwk.purchases.business.Purchase;

public class CustomerPurchaseConsoleUI {
	
	public void ShowUI() {
		
		System.out.printf("%-20s\n%-20s\n", "Customer/Purchase UI", "--------------------");
		System.out.printf("1 –  Read customer from file\n"
				+ "2 –  Read customer from file as JSON\n"
				+ "3 –  Write customer to file\n"
				+ "4 –  Write customer to file as JSON\n"
				+ "5 –  Show customer info on screen\n"
				+ "6 –  Read purchase from file\n"
				+ "7 –  Read purchase from file as JSON\n" 
				+ "8 -  Write purchase to file\n" 
				+ "9 -  Write purchase to file as JSON\n" 
				+ "10 – Show purchase info on screen\n"
				+ "11 - Exit\n" + 
				"Enter Choice:\n");
		
		
		Scanner input = new Scanner(System.in);
		int option = input.nextInt();
		
		while (option != 11) {
			
			switch (option) {
			
			case 1:
				System.out.println("Enter the File Name: ");
				Scanner s = new Scanner(System.in);
				String FileName = s.nextLine();
				
				try {
					Scanner inputFile = new Scanner(new FileReader(FileName));
					Customer c1= new Customer();
					c1.Read(inputFile);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
			case 2:
				System.out.println("Enter the File Name in JSON Format: ");
				Scanner s2 = new Scanner(System.in);
				String FileName2 = s2.nextLine();
				
				try {
					FileReader inputJSONFile = new FileReader(FileName2);
					Customer c2= new Customer();
					c2.ReadJSON(inputJSONFile);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
			case 3:
				System.out.println("Enter the File Name: ");
				Scanner s3 = new Scanner(System.in);
				String FileName3 = s3.nextLine();
				
				try {
					PrintStream outputFile = new PrintStream(FileName3);
					Customer c3= new Customer();
					c3.Write(outputFile);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
			case 4:
				System.out.println("Enter the File Name in JSON Format: ");
				Scanner s4 = new Scanner(System.in);
				String FileName4 = s4.nextLine();
				
				try {
					PrintStream outputJSONFile = new PrintStream(FileName4);
					Customer c4= new Customer();
					c4.WriteJSON(outputJSONFile);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
			case 5:
				
				Customer c5= new Customer();
				System.out.printf(c5.toString());
				
				break;
				
				
			case 6:
				System.out.println("Enter the File Name: ");
				Scanner s6 = new Scanner(System.in);
				String FileName6 = s6.nextLine();
				
				try {
					Scanner inputFile2 = new Scanner(new FileReader(FileName6));
					Purchase p1= new Purchase();
					p1.Read(inputFile2);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
			case 7:
				System.out.println("Enter the File Name in JSON Format: ");
				Scanner s7 = new Scanner(System.in);
				String FileName7 = s7.nextLine();
				
				try {
					FileReader inputJSONFile2 = new FileReader(FileName7);
					Purchase p2= new Purchase();
					p2.ReadJSON(inputJSONFile2);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
			case 8:
				System.out.println("Enter the File Name: ");
				Scanner s8 = new Scanner(System.in);
				String FileName8 = s8.nextLine();
				
				try {
					PrintStream outputFile2 = new PrintStream(FileName8);
					Purchase p3= new Purchase();
					p3.Write(outputFile2);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
			case 9:
				System.out.println("Enter the File Name in JSON Format: ");
				Scanner s9 = new Scanner(System.in);
				String FileName9 = s9.nextLine();
				
				try {
					PrintStream outputJSONFile2 = new PrintStream(FileName9);
					Purchase p4= new Purchase();
					p4.WriteJSON(outputJSONFile2);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				break;
				
			case 10:
				
				Purchase p5= new Purchase();
				System.out.printf(p5.toString());
				
				break;
				
				
			default:
				System.out.println("Wrong Input. Enter a number between 1-11: ");
				input = new Scanner(System.in);
				option = input.nextInt();
				break;
			}
			
			System.out.println("\n\nKeep Going!!! Enter another number between 1-11(Exit for 11): ");
			input = new Scanner(System.in);
			option = input.nextInt();
			
		}
		System.out.println("Successfully Exited!!!");
	}
}
