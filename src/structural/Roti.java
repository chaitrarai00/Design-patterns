package structural;

public class Roti implements Food{
	private String preparedfood;
	
	@Override
	public void preparefood(String itemsrequired) {
		this.preparedfood="Indian stuffed Bread"+itemsrequired;
	}

	@Override
	public String deliverfood() {
		return preparedfood;
	}

}
