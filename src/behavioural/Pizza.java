package behavioural;

public class Pizza implements Item{
	private int cost;
	private int id;
	public Pizza(int cost, int id) {
		this.cost=cost;
		this.id=id;
	}
	
	public int getCost() {
		return cost;
	}

	public int getId() {
		return id;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}
