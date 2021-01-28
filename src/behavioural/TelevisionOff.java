package behavioural;

public class TelevisionOff implements ControlExecute{
	Television television;
	public TelevisionOff(Television television) {
		this.television=television;
	}
	
	@Override
	public void execute() {
		this.television.off();
	}
}