package daodataaccessobject;

import java.util.List;

/*
 * The interface for persisting logic
 */
public interface LehngaDAO {
	public List<Lehnga> getAllLehngas();
	public Lehnga getLehngabyno(int number);
	public void savelehnga(Lehnga lehnga);
	public void deletelehnga(Lehnga lehnga);
	
}
