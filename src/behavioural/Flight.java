package behavioural;

public class Flight implements Command{
	ATCInfo atcinfo;
	public Flight(ATCInfo atcinfo) {
		this.atcinfo=atcinfo;
	}
	@Override
	public void land() {
		if(atcinfo.isavailable()) {
			System.out.println("get ready to land");
			atcinfo.setAvailabilitystatus(false);
		}
		else {
			System.out.println("please wait and hover");
	}}
	public void readytoland() {
		
			System.out.println("Yes clear to land");
	}
	public void parked() {
		System.out.println("Flight Parked successfully");
		atcinfo.setAvailabilitystatus(true);
	}

}
