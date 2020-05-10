package inheritance;

public class BankAccount {
	
	protected String m_account_Name;
	protected double m_account_Balance;
	
	public void set_account_Name(String account_Name) {
		m_account_Name = account_Name;
				}
	public void set_account_Balance(double account_Balance) {
		m_account_Balance = account_Balance;
	}
	public String get_account_Name() {
		return m_account_Name;
	}
	public double get_account_Balance() {
		return m_account_Balance;
		}
	
	
	
	BankAccount() {
		m_account_Name = "David";
		m_account_Balance = 5000;
		
	}
	
	BankAccount(String account_Name, double account_Balance){
		m_account_Name = account_Name;
		m_account_Balance = account_Balance;
	}
	
	
	public void Deposit(double amount) {
		
		m_account_Balance += amount;
	}
	
	public void Withdraw(double amount) {
		
		if (amount <= m_account_Balance) {
			m_account_Balance -= amount;
			//System.out.printf("Amount: $%f", m_account_Balance);
		}
		
		else {
			System.out.printf("Amount overexceeds the balance");
		}
				
	}
	
	public void Show() {
		
	System.out.printf("Name: %s\nAvailable Balance: $%f", m_account_Name, m_account_Balance);
	}
	
	
	

}
