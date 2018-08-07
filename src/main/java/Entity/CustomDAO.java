package Entity;

public interface CustomDAO {

	public void insert(CustomerCLS customer);
	
     public CustomerCLS findById(int id);

}
