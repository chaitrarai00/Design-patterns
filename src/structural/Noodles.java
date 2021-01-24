package structural;

public class Noodles implements Food{
private String preparedfood;
	
	@Override
	public void preparefood(String itemsrequired) {
		this.preparedfood="Spricy Long Sphegetti"+itemsrequired;
	}

	@Override
	public String deliverfood() {
		return preparedfood;
	}
}
