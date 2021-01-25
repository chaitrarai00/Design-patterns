package structural;

public class BridgeCreate {
/*
 * The Studio Tune and Compose acts 
 * as a Bridge for common functions for similar objects
 */
	public static void main(String[] args) {
		Song song=new Rap(new Compose(),new Tune());
		song.produce();
		Song song1=new Folk(new Compose(),new Tune());
		song1.produce();
	}
                  
}
