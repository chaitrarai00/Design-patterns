package behavioural;

public class StartegyDesignPatternConsumer {

	public static void main(String[] args) {
		System.out.println("Before the Aplocalypse");
		Player player1=new Player("Sane Person");
		Player player2=new Player("Insane Devil");
		player1.setStrategy(new DefensiveStrategy());
		player2.setStrategy(new AggressiveStrategy());
		player1.action();
		player2.action();
		System.out.println("After the Aplocalypse");
		player1.setStrategy(new AggressiveStrategy());
		player2.setStrategy(new DefensiveStrategy());
		player1.action();
		player2.action();
	}

}
