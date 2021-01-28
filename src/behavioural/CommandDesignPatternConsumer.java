package behavioural;
/*
 * Encapsulate more functionality to different objects and decouple more 
 * and invoke when needed
 * RemoteControl in the example is invoked and utilized by both TV and settopbox
 * decouple the command needed and invoke them when needed
 */
public class CommandDesignPatternConsumer {

	public static void main(String[] args) {
		RemoteControl remoteControl=new RemoteControl();
		SetTopBox setTopBox=new SetTopBox();
		SetTopBoxOn setTopBoxon=new SetTopBoxOn(setTopBox);
		SetTopBoxoff setTopBoxoff=new SetTopBoxoff(setTopBox);
		Television television=new Television();
		TelevisionOn televisionOn=new TelevisionOn(television);
		TelevisionOff televisionOff=new TelevisionOff(television);
		remoteControl.setCommand(televisionOn);
		remoteControl.pressButton();
		remoteControl.setCommand(setTopBoxon);
		remoteControl.pressButton();
		remoteControl.setCommand(setTopBoxoff);
		remoteControl.pressButton();
		remoteControl.setCommand(televisionOff);
		remoteControl.pressButton();
	}

}
