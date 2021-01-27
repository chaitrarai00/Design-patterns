package behavioural;

public class ObserverImpl implements Observer{
	
	private String name;
	private Chart chart;
	
	@Override
	public void subscribe(Chart chart) {
		this.chart=chart;
	}

	@Override
	public void update() {
		String msg=(String)this.chart.getUpdate(this);
		if(msg==null) {
			System.out.println("No Message Update");
			
		}
		else {
			System.out.println("Message Update: "+msg);
		}
	}

}
