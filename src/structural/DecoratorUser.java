package structural;
/*
 * 
 *Using Decorator we compose the classes such that multiple functionalities 
 *are added separately independent to each other
 *The order is modified below with each call and functionality start from
 *Basic and advance to hot or cold or both added
 */
public class DecoratorUser {

	public static void main(String[] args) {
	BasicCoffee coffee=new BasicCoffee();
	System.out.println("-----------Order 1: -------------");
	coffee.cook();
	System.out.println("-----------Order 2: -------------");
	HotCoffee coffee2=new HotCoffee(coffee);
	coffee2.cook();
	System.out.println("-----------Order 3: -------------");
	ColdCoffee coffee3=new ColdCoffee(coffee2);
	coffee3.cook();
	}

}
