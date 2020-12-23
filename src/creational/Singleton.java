package creational;

public class Singleton {
	//not a good practise because unnecessary memory is accomodated
	//private static Singleton instance_ofsingleton=new Singleton();
	//instead use lazy intialization
	private static Singleton instance_ofsingleton_lazy=null;

	private Singleton() {
		
	}
	/*
	 * use synchronized to provide threadlock and avoid issues 
	 * when multiple thread try to create singleton objects
	 * using synchronized method will slow down the process 
	 * since lock is added to the whole method
	 * so instead use synchronized block and 
	 * minimize the area synchronization has to be done in
	 */
	public static Singleton getinstance() {
		if(instance_ofsingleton_lazy==null)
			synchronized (Singleton.class) {
				if(instance_ofsingleton_lazy==null) 
				{
				instance_ofsingleton_lazy= new Singleton();
				}
			}
			
		return instance_ofsingleton_lazy;
	}
}
