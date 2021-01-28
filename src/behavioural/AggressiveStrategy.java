package behavioural;

public class AggressiveStrategy implements Strategy{

	@Override
	public void action() {
		System.out.print("Hit and KILL");
	}
	
}