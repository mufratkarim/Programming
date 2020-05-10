package inheritance;

public class InterestAccount extends BankAccount {
	
	private double m_interest;
	
	
	public void set_Interest(double interest) {
		m_interest = interest;
	}
	public double get_Interest() {
		return m_interest;
	}

	
	public InterestAccount() {
		
		super(); // call base constructor
		m_interest = 0.5;
	}
	
	
	public InterestAccount(String account_Name, double account_Balance, double interest) {
		super(account_Name, account_Balance); // Call two parameters from base
		m_interest = interest;
	}
	
	
	public void ApplyInterest() {
		
		double interest_Amount = m_account_Balance * m_interest;
		m_account_Balance += interest_Amount;
		
	}
	

}
