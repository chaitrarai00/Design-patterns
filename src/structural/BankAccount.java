package structural;

public class BankAccount {
	private String City;
	private String accountno;
	private String IFSC;
	private String name;
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getIFSC() {
		return IFSC;
	}
	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
