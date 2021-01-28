package behavioural;

public class Player {
	private String type;
	private Strategy behavior;
	
	public Player(String type) {
		this.type=type;
	}
	
	public void setStrategy(Strategy strategy) {
		this.behavior=strategy;
	}
	
	public void action() {
		System.out.println("Player "+this.type+": ");
		this.behavior.action();
	}
	
}
