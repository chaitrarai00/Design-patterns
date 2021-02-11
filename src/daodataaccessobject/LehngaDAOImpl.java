package daodataaccessobject;

import java.util.ArrayList;
import java.util.List;

/*
 * The concrete class implementing DAO interface
 * We treat List as the persisting area and persist all lehngas in a list
 * as the implementation in the below class
 */
public class LehngaDAOImpl implements LehngaDAO{
	
	//list as Database
	private List<Lehnga> collections;
	
	
	
	public LehngaDAOImpl() {
		super();
		collections=new ArrayList<Lehnga>();
		collections.add(new Lehnga(1, "Red Georgette"));
		collections.add(new Lehnga(2, "Jarkan Net"));
		collections.add(new Lehnga(3,"Silk Velvet"));
		//initial collection
	}

	@Override
	public List<Lehnga> getAllLehngas() {
		// TODO Auto-generated method stub
		return collections;
	}

	@Override
	public Lehnga getLehngabyno(int no) {
		// TODO Auto-generated method stub
		return collections.get(no);
	}

	@Override
	public void savelehnga(Lehnga lehnga) {
		// TODO Auto-generated method stub
		collections.add(lehnga);
	}

	@Override
	public void deletelehnga(Lehnga lehnga) {
		// TODO Auto-generated method stub
		collections.remove(lehnga);
	}

}
