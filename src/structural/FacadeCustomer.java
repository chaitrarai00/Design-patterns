package structural;

/*
 * Design Pattern used to hide unnecessary implementation related details
 * only the minimal information expected from client code is expected 
 * and the rest is managed internally(here by the foodAppMediator)
 */
public class FacadeCustomer {

	public static void main(String[] args) {
		FoodAppMediator foodwaiter=new FoodAppMediator();
		System.out.println(foodwaiter.getFood(FoodType.NOODLES));
	}

}
