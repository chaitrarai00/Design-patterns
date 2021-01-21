package creational;

public class DesignPatternDriver_Prototype {

	public static void main(String[] args) {
		/*
		 * we create multiple copies of same object
		 */
		Flight flight=new Flight();
		Flight flight1=(Flight) flight.clone();

	}

}
