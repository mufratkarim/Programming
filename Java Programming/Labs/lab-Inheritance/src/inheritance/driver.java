package inheritance;

public class driver {

	public static void main(String[] args) {
		
		
		BankAccount b = new BankAccount();
		
		b.Deposit(525);
		b.Withdraw(300);
		b.Show();
		
		
		InterestAccount i = new InterestAccount("\nStephen", 1222, 0.9);
		
		i.Deposit(500212);
		i.Withdraw(233);
		
		i.ApplyInterest();
		i.Show();
		

	}

}
