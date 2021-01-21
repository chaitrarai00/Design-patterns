package creational;

import java.util.ArrayList;
import java.util.List;

public class Flight implements Cloneable{

	private ArrayList<String> flights;
	
	public ArrayList<String> defaultflights() {
		String[] flights={"Air India","European Airlines","London Airways","Kindfisher jets"};
		return (ArrayList<String>) List.of(flights);
	}

	public Flight() {
		this.flights=this.defaultflights();
	}
	
	public Object clone(){
		this.flights=this.defaultflights();
		return this;
	}
	

}
