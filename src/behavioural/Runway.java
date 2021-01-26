package behavioural;

public class Runway implements Command{
	ATCInfo atcInfo;
	public Runway(ATCInfo atcInfo) {
		this.atcInfo=atcInfo;
	}
	@Override
	public void land() {
	
			System.out.println("Runway available");
			atcInfo.setAvailabilitystatus(true);
	}

}
