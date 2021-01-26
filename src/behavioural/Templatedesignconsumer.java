package behavioural;
/*
 * A Basic Template class is created from 
 * which other class can make use to create a basic template
 */
public class Templatedesignconsumer {

	public static void main(String[] args) {
		ComputerTemplate ct=new Laptop();
		ct.buildcomputer();
		ct.installos();
	}

}
