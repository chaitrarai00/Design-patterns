package structural;

public class CurrentAccount implements Account{
	private String Bankname;
	private double balance;
	
	public CurrentAccount(String bankname, double balance) {
		this.Bankname=bankname;
		this.balance=balance;
	}
	@Override
	public void showaccountdetails() {
		System.out.println(this.Bankname+" with balance "+this.balance);
	}
}
