package structural;

public class Rap extends Song{

	public Rap(Studio st1, Studio st2) {
		super(st1, st2);
	}

	@Override
	void produce() {
		System.out.print("Rap song creation");
		this.studio1.release();
		this.studio2.release();
	}

}
