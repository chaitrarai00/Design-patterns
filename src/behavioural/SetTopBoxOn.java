package behavioural;

public class SetTopBoxOn implements ControlExecute{
	SetTopBox setTopBox;
	public SetTopBoxOn(SetTopBox setTopBox) {
		this.setTopBox=setTopBox;
	}
	
	@Override
	public void execute() {
		this.setTopBox.on();
		this.setTopBox.setchannel(300);
		this.setTopBox.setvolume(45);
	}

}
