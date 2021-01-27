package behavioural;

import java.util.ArrayList;
import java.util.List;

public class BigCStock implements Chart{
	private List<Observer> observers;
	private String msg;
	private boolean changed;
	
	public BigCStock() {
		this.observers=new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer obs) {
		if(obs==null) {
			throw new NullPointerException("There is no observer to update");
		}
		else {
			if(!observers.contains(obs)) {
				observers.add(obs);
			}
		}
	}

	@Override
	public void unregister(Observer obs) {
		observers.remove(obs);
		
	}

	@Override
	public void notifyObserver() {
		if(!changed)
			return;
		else {
			this.changed=false;
			for(Observer observer:observers) {
				observer.update();
			}
		}
		
	}

	@Override
	public Object getUpdate(Observer obs) {
		
		return this.msg;
	}
	
	public void postmessage(String msg) {
		System.out.println("Post message: "+msg);
		this.msg=msg;
		this.changed=true;
		notifyObserver();
	}

}
