package structural;


public class DriverAdapter extends TaxiDriver implements Driver{
	private Person person;
	public DriverAdapter(Person person) {
		this.person=person;
		this.adaptdata(person);
	}
	public void adaptdata(Person person) {
		this.setCarno(person.getCarno());
		this.setLicenceno(person.getLicenceno());
		String[] personBankaccountStrings=person.getBankaccountdetails().split(",");
		BankAccount account=new BankAccount();
		account.setCity(personBankaccountStrings[0]);
		account.setAccountno(personBankaccountStrings[1]);
		account.setIFSC(personBankaccountStrings[2]);
		account.setName(personBankaccountStrings[3]);
		this.setBankaccountdetails(account);
	}
}
