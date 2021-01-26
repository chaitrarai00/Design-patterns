package behavioural;

public class Laptop extends ComputerTemplate{

	@Override
	public void installos() {
		System.out.println("Mac install");
	}

	@Override
	public void assemblecomponents() {
		System.out.println("8GB RAM, 4 HDMI port");
	}

}
