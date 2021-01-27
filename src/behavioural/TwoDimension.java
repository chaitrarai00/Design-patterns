package behavioural;

import java.util.Arrays;

public class TwoDimension implements Chain {
private Chain nextchain;
	
	@Override
	public void setNext(Chain chain) {
		this.nextchain=chain;
	}

	@Override
	public void process(Dimension dimension) {
		if(dimension.getCoordinates().length==2)
		{
			System.out.println("Two Dimension coordinates"+Arrays.toString(dimension.getCoordinates()));
		}
		else
		nextchain.process(dimension);
	}
}
