package behavioural;

public class SilentState implements MobileAlertStates{

	@Override
	public void alert() {
		System.out.println("Mobile is in Silent Mode");
		
	}

}
