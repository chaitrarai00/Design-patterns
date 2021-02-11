package daodataaccessobject;
/*
 * DAO (Data Access Object) Design Pattern is used to separate persistence logic in a separate layer
 * This way the service stays behind the scenes and the low-level operations for data access is not revealed
 * This is known as Separation of Logic.
 * 
 * every Dao has a model for transfer between layers, an interface for flexibility and scaling and its implementation with persistence logic
 * in this exaample lets have the model: Lehnga
 * LehngaDAO inteface as API to implement
 * LehngaDAOImpl the concrete class with persistence logic implementation implementing the LehngaDAO
 */
public class DaoPatternLehnga {

	public static void main(String[] args) {
		//use the interface for communication with db 
		LehngaDAO lehngaDAO=new LehngaDAOImpl();
		for(Lehnga lehnga:lehngaDAO.getAllLehngas()) {
			System.out.println(lehnga.getLehngano()+":"+lehnga.getLehnganame());
		}
		//update collection
		Lehnga lehnga=lehngaDAO.getAllLehngas().get(1);
		lehnga.setLehnganame("Red Georgette with lakhnavi print");
		lehngaDAO.savelehnga(lehnga);
		Lehnga lehnga1=lehngaDAO.getAllLehngas().get(2);
		lehngaDAO.deletelehnga(lehnga1);
		for(Lehnga lehngasample:lehngaDAO.getAllLehngas()) {
			System.out.println(lehngasample.getLehngano()+":"+lehngasample.getLehnganame());
		}
	}

}
