package structural;

public class RegisterusingAdapter {

	public static void main(String[] args) {
		Person person=new Person();
		person.setCarno("KA 10 M 6197");
		person.setLicenceno("DRJPRCGS28238");
		person.setBankaccountdetails("Mysore,12345678912345,MYS12345,Chaithra"); 
		// a person enters his details for registeration using this we need to
		//map each driver to respective taxi driver and link their bank details 
		Driver driver=new DriverAdapter(person);
		System.out.println("Car no"+driver.getCarno());
		System.out.println("license no"+driver.getLicenceno());
		System.out.println("BankDetails"+driver.getBankaccountdetails().getCity()+" "+driver.getBankaccountdetails().getName());
	}

}
