package behavioural;

import java.util.Arrays;

public class ThreeDimension implements Chain{
private Chain nextchain;
	
	@Override
	public void setNext(Chain chain) {
		this.nextchain=chain;
	}

	@Override
	public void process(Dimension dimension) {
		if(dimension.getCoordinates().length==3)
		{
			System.out.println("Three Dimension coordinates"+Arrays.toString(dimension.getCoordinates()));
		}
		
	}
}
