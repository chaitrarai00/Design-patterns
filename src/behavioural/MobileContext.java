package behavioural;

public class MobileContext {
	MobileAlertStates currentstate;
	
	public void setState(MobileAlertStates state) {
		this.currentstate=state;
	} 
	public MobileContext() {
		this.currentstate=new RingState();
	}
	
	public void alert() {
		this.currentstate.alert();
	}
}




