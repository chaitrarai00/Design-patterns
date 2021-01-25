package structural;

public class Decorator implements Coffee{
	Coffee coffee;
	public Decorator(Coffee coffee) {
		this.coffee=coffee;
	}
	@Override
	public void cook() {
		this.coffee.cook();
	}

}
