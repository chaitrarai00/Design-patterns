package behavioural;

public class Desktop extends ComputerTemplate{

	@Override
	public void installos() {
		System.out.println("Windows install");
	}

	@Override
	public void assemblecomponents() {
		System.out.println("4GB RAM, HDMI port");
	}

}
