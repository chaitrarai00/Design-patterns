package behavioural;

public class SetTopBox {
	public void on() {
		System.out.println("Setup box is switched on");
	}
	public void off() {
		System.out.println("Setup box is switched off");
	}
	public void setchannel(int channel) {
		System.out.println("Channel is set to"+channel);
	}
	public void setvolume(int volume) {
		System.out.println("Volume is set to"+volume);
	}
}
