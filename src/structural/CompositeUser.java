package structural;

public class CompositeUser {

	public static void main(String[] args) {
		SavingsAccount vijbsb=new SavingsAccount("Vijaya Bank", 25000);
		SavingsAccount sbisb=new SavingsAccount("SBI",120000);
		SavingsAccount icicisb=new SavingsAccount("ICICI",10000);
		CurrentAccount vijbca=new CurrentAccount("Vijaya Bank", 5000);
		CurrentAccount sbica=new CurrentAccount("SBI",125000);
		CurrentAccount icicica=new CurrentAccount("ICICI",10000);
		
		CombinedAccounts collate=new CombinedAccounts();
		collate.addaccount(vijbsb);
		collate.addaccount(vijbca);
		collate.addaccount(sbica);
		collate.addaccount(icicisb);
		collate.addaccount(icicica);
		
		collate.showaccountdetails();//show all added bank details
	}

}
