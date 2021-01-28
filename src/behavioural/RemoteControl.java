package behavioural;

public class RemoteControl {
	ControlExecute controlExecute;
	public void setCommand(ControlExecute controlExecute) {
		this.controlExecute=controlExecute;
	}
	
	public void pressButton() {
		this.controlExecute.execute();
	}
}
