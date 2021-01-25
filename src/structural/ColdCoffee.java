package structural;

public class ColdCoffee extends Decorator{
	
	public ColdCoffee(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public void cook() {
		super.cook();
		System.out.println("Add Grinded Frozen Milk Solids with chocochips and whipped cream on top");
	}
}
