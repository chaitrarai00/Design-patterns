package structural;

public class FoodAppMediator {
		private Ingredients itemsrequired=new Ingredients();
	public String getFood(FoodType foodType) {
		switch(foodType) {
		case ROTI:
			Roti roti=new Roti();
			roti.preparefood(itemsrequired.getRotiitems());
			return roti.deliverfood();
		case BURGER:
			Burger burger=new Burger();
			burger.preparefood(itemsrequired.getBurgeritems());
			return burger.deliverfood();
		case NOODLES:
			Noodles noodles=new Noodles();
			noodles.preparefood(itemsrequired.getNoodlesitems());
			return noodles.deliverfood();
		}
		return null;
	}

}
