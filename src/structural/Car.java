package structural;

public class Car implements Vehicle{
String MAXSPEED="200kmph";
	
	@Override
	public void color(String color) {
		System.out.println("Gadi "+color+" ki");
		
	}

	@Override
	public void startEngine() {
		System.out.println("chalale ithe "+MAXSPEED+" speed mein");
	}

}
