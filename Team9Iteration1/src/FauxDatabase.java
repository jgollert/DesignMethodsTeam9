import java.util.ArrayList;

// This is where we will store all of our faux data
public class FauxDatabase {
	
	private static FauxDatabase instance;
	private ArrayList<Users> userTable;
	private ArrayList<Template> templateTable;
	
	public static synchronized FauxDatabase getInstance() {
		if (instance == null)
			instance = new FauxDatabase();
		
		return instance;
	}
	
	public FauxDatabase () {
	}

}
