package behavioural;

public class SetTopBoxoff implements ControlExecute{
	SetTopBox setTopBox;
	public SetTopBoxoff(SetTopBox setTopBox) {
		this.setTopBox=setTopBox;
	}
	
	@Override
	public void execute() {
		this.setTopBox.off();
	}
}
