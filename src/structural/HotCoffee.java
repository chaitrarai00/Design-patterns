package structural;

public class HotCoffee extends Decorator{

	public HotCoffee(Coffee coffee) {
		super(coffee);
		
	}
	
	@Override
	public void cook() {
		super.cook();
		System.out.println("Add Dark Chocolate Syrup with WhippedCream Topped with ButterScotch");
	}
}
