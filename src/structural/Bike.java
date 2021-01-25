package structural;

public class Bike implements Vehicle{
String MAXSPEED="150kmph";
	
	@Override
	public void color(String color) {
		System.out.println("Bike Apni "+color+" ki");
		
	}

	@Override
	public void startEngine() {
		System.out.println("main chalata "+MAXSPEED+" match tu nhi kar payega");
	}
}
