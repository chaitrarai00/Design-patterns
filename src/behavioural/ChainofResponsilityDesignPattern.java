package behavioural;
/*
 * If a particular part of chain is not able to function in required manner 
 * transfer it to next chain 
 * in short a chain of responsible parts in sequence
 * ex: for logging either Info handles the issue first 
 * if that is not able to handle tranfers to Debug and then finally error
 */
public class ChainofResponsilityDesignPattern {

	public static void main(String[] args) {
		Chain c1=new Onedimension();
		Chain c2=new TwoDimension();
		Chain c3=new ThreeDimension();
		//comment below lines and it will break the chain
		c1.setNext(c2);
		c2.setNext(c3);
		
		c1.process(new Dimension(5));
		c1.process(new Dimension(5,3,6));
		c1.process(new Dimension(5,8));
		c1.process(new Dimension(53));
	}

}
