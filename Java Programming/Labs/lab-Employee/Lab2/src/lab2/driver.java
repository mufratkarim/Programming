package lab2;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name1, Name2;
		int hoursWorked1, hourlyRate1, pay1, hoursWorked2, hourlyRate2, pay2;
		Name1 = "Jamal"; Name2 = "Stephen";
		hoursWorked1 = 12; hoursWorked2 = 40;
		hourlyRate1 = 15; hourlyRate2 = 14;
		employee Jamal = new employee();
		Jamal.setName(Name1);
		Jamal.sethoursWorked(hoursWorked1);
		Jamal.sethourlyRate(hourlyRate1);
		pay1 = Jamal.GetPay();
		employee Stephen = new employee(Name2, hoursWorked2, hourlyRate2);
		
		System.out.printf("Your name is: %s\nYour worked: %d hours\nYour hourly rate was: %d\nYour pay is: %d\n", Name1, hoursWorked1,hourlyRate1, pay1);
		System.out.printf("Your name is: %s\nYour worked: %d hours\nYour hourly rate was: %d", Name2, hoursWorked2,hourlyRate2);
	}

}
