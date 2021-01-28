package behavioural;
/*
 * Design Pattern to change the behavior based on the internal state or property
 */
public class StateDesignPattern {

	public static void main(String[] args) {
		//first inistaila default state would be ring
		MobileContext mobile=new MobileContext();
		mobile.alert();
		mobile.setState(new SilentState());
		mobile.alert();
		mobile.setState(new VibrateState());
		mobile.alert();
		mobile.setState(new RingState());
		mobile.alert();
	}

}
