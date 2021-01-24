package structural;

public class Burger implements Food{
private String preparedfood;
	
	@Override
	public void preparefood(String itemsrequired) {
		this.preparedfood="Big Boy Mac"+itemsrequired;
	}

	@Override
	public String deliverfood() {
		return preparedfood;
	}
}
