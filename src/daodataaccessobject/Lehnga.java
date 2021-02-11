package daodataaccessobject;

public class Lehnga {
	private int Lehngano;
	public Lehnga(int lehngano, String lehnganame) {
		super();
		Lehngano = lehngano;
		this.lehnganame = lehnganame;
	}
	public Lehnga() {
		super();
	}
	public int getLehngano() {
		return Lehngano;
	}
	public void setLehngano(int lehngano) {
		Lehngano = lehngano;
	}
	public String getLehnganame() {
		return lehnganame;
	}
	public void setLehnganame(String lehnganame) {
		this.lehnganame = lehnganame;
	}
	private String lehnganame;
}
