package behavioural;
/*
 * add to visitor when new products are added
 */
public interface ShoppingCartVisitor {
	public int visit(Burger burger);
	public int visit(Pizza pizza);
}
