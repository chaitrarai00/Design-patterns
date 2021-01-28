package behavioural;

public class VisitorImpl implements ShoppingCartVisitor{

	@Override
	public int visit(Burger burger) {
		//15 rs cashback
		return burger.getCost()-15;
	}

	@Override
	public int visit(Pizza pizza) {
		//100 rs cashback
		return pizza.getCost()-100;
	}
	
}
