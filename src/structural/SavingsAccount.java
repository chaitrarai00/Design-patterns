package structural;

public class SavingsAccount implements Account{
	private String Bankname;
	private double balance;
	
	public SavingsAccount(String bankname, double balance) {
		this.Bankname=bankname;
		this.balance=balance;
	}
	@Override
	public void showaccountdetails() {
		System.out.println(this.Bankname+" with balance "+this.balance);
	}

}
