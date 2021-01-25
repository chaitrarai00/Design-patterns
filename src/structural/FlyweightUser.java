package structural;
/*
 * Used to create a single object which varies in ceratin properties
 * and change only the mentioned propertie(Note its different from singleton)
 */
public class FlyweightUser {

	public static void main(String[] args) {
		Vehicle v=VehicleFactory.getVehicle("Car");
		v.color("Black");
		v.startEngine();
		System.out.println(v);
		
		Vehicle v1=VehicleFactory.getVehicle("Bike");
		v1.color("Black");
		v1.startEngine();
		System.out.println(v1);
		Vehicle v2=VehicleFactory.getVehicle("Bike");
		v2.color("Blue");
		v2.startEngine();
		System.out.println(v2);
		
		Vehicle v3=VehicleFactory.getVehicle("Roller");
		v3.color("Black");
		v3.startEngine();
		System.out.println(v3);

		
	}

}
