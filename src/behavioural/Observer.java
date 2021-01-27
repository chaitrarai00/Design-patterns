package behavioural;

/*
 * The classes implementing this subscribes or wants to get information on 
 * subjects they have subscribed to and would like to recieve updates
 */
public interface Observer {
	public void subscribe(Chart chart);
	public void update();
}
