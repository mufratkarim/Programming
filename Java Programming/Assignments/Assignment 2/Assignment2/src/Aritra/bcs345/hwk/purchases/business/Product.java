package Aritra.bcs345.hwk.purchases.business;

import java.io.PrintStream;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Contains main program code. This class generates the Product class of the business 
 * package of assignment2.
 * 
 * @author Mufrat Karim Aritra
 * @version 1.0
 * @since 9/27/2019
 *
*/

public class Product {
	
	// Data Hiding
	private String m_Description;
	private double m_Price;
	
	// Default Constructor
	public Product() {
		m_Description = "Oneplus 7T";
		m_Price = 650;
	}
	
	// Setter and Getter for Description
	public void setDescription(String Description) {
		m_Description = Description;
	}
	
	public String getDescription() {
		return m_Description;
	}
	
	// Setter and Getter for Price
	public void setPrice(double Price) {
		m_Price = Price;
	}
	public double getPrice() {
		return m_Price;
	}
	
	public void Write(PrintStream ps) {
		
		ps.println(m_Description);
		ps.println(m_Price);
		
	}
	
	public void Read(Scanner s) {
		
		m_Description = s.nextLine();
		m_Price = s.nextInt();
	}
	
	public void WriteJSON(PrintStream ps) {
		
		Product e2 = new Product();
		e2.setDescription(m_Description);
		e2.setPrice(m_Price);

		
		// Setting up JSON
		GsonBuilder builder = new GsonBuilder(); 
		builder.setPrettyPrinting(); 
		Gson gson = builder.create();

		String jsonString2 = gson.toJson(e2);
		ps.println(jsonString2);  
		
	}
	
	public void ReadJSON(Scanner s) {
		
		String jsonString = " ";
		
		// Setting up JSON
		GsonBuilder builder = new GsonBuilder(); 
		builder.setPrettyPrinting(); 
		Gson gson = builder.create();
		
		
		// Adding variable values in JSON
		while (s.hasNext()) {
			m_Description = s.nextLine();
			jsonString += m_Description;
			m_Price = s.nextInt();
			jsonString += m_Price;
			
			/*if(s.hasNext()) {
		    	  s.nextLine();
		      }      
		    */
		}
		
		Address e2 = gson.fromJson(jsonString, Address.class);
		System.out.println(e2);
	}
	
	@Override
	public String toString()  {
		String s = String.format("%s, $%.2f", m_Description, m_Price);
		return s;
	}
	
	

}
