package creational;

public class DesignPatternDriver_Singleton {

	public static void main(String[] args) {
		Singleton s1=Singleton.getinstance();
		Singleton s2=Singleton.getinstance();
		System.out.println(s1+" "+s2+" "+s1.equals(s2));
		
		//one can break singleton using serialization/reflection
		//junit uses reflection to break singleton
	}

}
