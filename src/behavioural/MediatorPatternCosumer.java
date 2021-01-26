package behavioural;
/*
 * ATC is the Mediator that checks for registeration of both flights and runway
 */
public class MediatorPatternCosumer {

	public static void main(String[] args) {
		AirwayTrafficControl airwayTrafficControl=new AirwayTrafficControl();
		Runway runway=new Runway(airwayTrafficControl);
		Flight flight=new Flight(airwayTrafficControl);
		airwayTrafficControl.register_runway();
		airwayTrafficControl.register_flight();
		flight.readytoland();
		runway.land();
		flight.land();
		Flight flight1=new Flight(airwayTrafficControl);
		flight1.readytoland();
		flight1.land();
		flight.parked();
		flight1.readytoland();
		flight1.land();
	}

}
