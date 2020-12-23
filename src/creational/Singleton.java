package creational;

public class Singleton {
	private static Singleton instance_ofsingleton=new Singleton();
	private Singleton() {
		
	}
	public static Singleton getinstance() {
		return instance_ofsingleton;
	}
}
