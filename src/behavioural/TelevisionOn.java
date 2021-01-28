package behavioural;

public class TelevisionOn implements ControlExecute{
	Television television;
	public TelevisionOn(Television television) {
		this.television=television;
	}
	
	@Override
	public void execute() {
		this.television.on();
		this.television.setvolume(12);
	}
}