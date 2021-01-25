package structural;

import java.util.HashMap;

public class VehicleFactory {
	
	private static HashMap<String, Vehicle> map=new HashMap<>();
	public static Vehicle getVehicle(String type) {
		Vehicle v=null;
		if(map.containsKey(type)) {
			v=map.get(type);
		}
		else {
			switch(type) {
			case "Car": v=new Car();
						break;
			case "Bike":v=new Bike();
				break;
			default: throw new IllegalArgumentException("No such Vehicle type exists");			
			}
			map.put(type,v);
		}
		return v;
	}
}
