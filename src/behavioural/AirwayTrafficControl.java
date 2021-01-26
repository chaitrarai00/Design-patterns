package behavioural;

public class AirwayTrafficControl implements ATCInfo{
	private Runway runway;
	private Flight flight;
	private Boolean available;
	@Override
	public void register_runway() {
		System.out.print("Registered RUnway");
	}

	@Override
	public void register_flight() {
		System.out.print("Registered Flight");
	}

	@Override
	public void setAvailabilitystatus(boolean status) {
		this.available=status;
	}

	@Override
	public boolean isavailable() {

		return available;
	}

}
