package behavioural;
/*
 * Helps to perform operation collectively on group of objects instead of individual objects
 * like we can accept and get cost of all the objects(burger and Pizza) and work on providing offers
 * without changing the specific class only by changing visitorIMPl
 */
public class VisitorConsumer {

	public static void main(String[] args) {
		Item[] Items=new Item[] {
				new Burger(110, 01),new Pizza(650, 02),new Pizza(350, 02)
		};
		System.out.println("total bill is:"+calculatecost(Items));
	}
	public static int calculatecost(Item[] items) {
		int sum=0;
		for(Item item:items) {
			ShoppingCartVisitor visitor=new VisitorImpl();
			sum=sum+item.accept(visitor);
		}
		return sum;
	}
}
