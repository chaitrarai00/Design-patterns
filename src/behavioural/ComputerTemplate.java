package behavioural;

public abstract class ComputerTemplate {
	
	public void buildcomputer() {
		System.out.println("buuild computer");
	}
	public abstract void installos();
	public abstract void assemblecomponents();
	public void startcomputer() {
		System.out.println("start computer");
	}
}
