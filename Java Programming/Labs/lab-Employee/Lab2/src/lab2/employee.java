package lab2;

public class employee {
	// Data hiding
	private String name;
	private int hoursWorked, hourlyRate;
	
	
	// Setter & Getter for name
	public void setName(String N) {
		name = N;
	}
	public String getName() {
		return name;
	}
	
	// Setter & Getter for hoursWorked
	public void sethoursWorked(int hW) {
		hoursWorked = hW;
	}
	public int gethoursWorked() {
		return hoursWorked;
	}
	
	// Setter & Getter for hourlyRate
	public void sethourlyRate(int hR) {
		hourlyRate = hR;
	}
	public int gethourlyRate() {
		return hourlyRate;
	}
	
	// Default Constructor
	employee() {
		String name;
		int hoursWorked, hourlyRate;
	}
	
	// Parameterized Constructor
	employee(String name, int hoursWorked, int hourlyRate) {
		name = getName();
		hoursWorked = gethoursWorked();
		hourlyRate = gethourlyRate();
	}
	
	// GetPay Method
	public int GetPay() {
		return hoursWorked * hourlyRate;
	}
	
}
