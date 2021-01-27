package behavioural;

/*
 * register to the channel or chart or unregister
 * to get or not get the updates 
 * having a subscription/registration notifies all observers
 * something like youtube channels
 */
public interface Chart {
	public void register(Observer obs);
	public void unregister(Observer obs);
	public void notifyObserver();
	public Object getUpdate(Observer obs);
}
