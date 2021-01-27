package behavioural;
/*
 * A chain to handle or transfer function to next member in chain
 *  splitting the responsibility or functions into chain of parts
 */
public interface Chain {
	public abstract void setNext(Chain chain);
	public abstract void process(Dimension dimension);
}
