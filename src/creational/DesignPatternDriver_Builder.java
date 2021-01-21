package creational;

public class DesignPatternDriver_Builder {

	public static void main(String[] args) {
		//use builders
		Person person =new Person().company("Infy");
		person.buildkids();// throws Exception in thread "main" java.lang.IllegalArgumentException: not married
	}
	

}
