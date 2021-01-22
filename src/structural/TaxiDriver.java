package structural;

public class TaxiDriver implements Driver{
	private String carno;
	private String licenceno;
	private BankAccount bankaccountdetails;
	public String getCarno() {
		return carno;
	}
	public void setCarno(String carno) {
		this.carno = carno;
	}
	public String getLicenceno() {
		return licenceno;
	}
	public void setLicenceno(String licenceno) {
		this.licenceno = licenceno;
	}
	public BankAccount getBankaccountdetails() {
		return bankaccountdetails;
	}
	public void setBankaccountdetails(BankAccount bankaccountdetails) {
		this.bankaccountdetails = bankaccountdetails;
	}
}
