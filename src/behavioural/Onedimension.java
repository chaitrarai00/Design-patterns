package behavioural;

import java.util.Arrays;

public class Onedimension implements Chain{
	private Chain nextchain;
	
	@Override
	public void setNext(Chain chain) {
		this.nextchain=chain;
	}

	@Override
	public void process(Dimension dimension) {
		if(dimension.getCoordinates().length==1)
		{
			System.out.println("One Dimension coordinates"+Arrays.toString(dimension.getCoordinates()));
		}
		else
		nextchain.process(dimension);
	}

}
