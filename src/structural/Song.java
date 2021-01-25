package structural;

public abstract class Song {
	protected Studio studio1;
	protected Studio studio2;
	
	public Song(Studio st1,Studio st2) {
		this.studio1=st1;
		this.studio2=st2;
	}
	
	abstract void produce();
}
