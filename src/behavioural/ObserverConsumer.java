package behavioural;
/*
 * This Pattern is where an observer keeps observing or getting data from
 * another channel who offers updates through subscriptions
 * any changes in the channel should notify all observers
 */
public class ObserverConsumer {

	public static void main(String[] args) {
		BigCStock stock=new BigCStock();
		
		Observer ob1=new ObserverImpl();
		Observer ob2=new ObserverImpl();
		Observer ob3=new ObserverImpl();
		
		ob1.subscribe(stock);
		ob2.subscribe(stock);
		ob3.subscribe(stock);
		stock.register(ob1);
		stock.register(ob2);
		stock.register(ob3);
		
		/*
		 * Uncomment line to see how a message is notifies everywhere
		 */
		//stock.postmessage("Shares increase 3 %");
		ob1.update();
		
		
	}

}
