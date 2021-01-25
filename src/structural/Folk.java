package structural;

public class Folk extends Song{

	public Folk(Studio st1, Studio st2) {
		super(st1, st2);
	}

	@Override
	void produce() {
		System.out.print("Folk song creation");
		this.studio1.release();
		this.studio2.release();
		
	}

}
