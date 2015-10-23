import java.util.ArrayList;

// This is where we will store all of our faux data
public class FauxDatabase {
	
	private static FauxDatabase instance;
	
	private ArrayList<Users> userTable;
	
	public static synchronized FauxDatabase getInstance() {
		if (instance == null)
			instance = new FauxDatabase();
		
		return instance;
	}
	
	public FauxDatabase () {
		// Create our faux advisor
		Advisor a1 = new Advisor();
		a1.setUserId(0);
		a1.setCredentials(new Credentials("pBond", "advisor"));
		
		
		ArrayList<Course> courseSetT1 = new ArrayList<Course>() {{
			add (new Course("Math1", "Fall", 2012, 1));
			add (new Course("Math2", "Fall", 2012, 2));
			add (new Course("Math3", "Spring", 2013, 3));
			add (new Course("Math4", "Spring", 2013, 4));
		
		}};
		
		Template t1 = new Template();
		t1.setCourses(courseSetT1);
		t1.setProgramName("Math");
		t1.setTemplateYear(2012);
		
		
		// Create our faux student 1
		Student s1 = new Student();
		s1.setUserId(1);
		s1.setCredentials(new Credentials("sroig2013", "student"));
		s1.setAdvisor(a1);
		s1.setTemplate(t1);
		
		// Create our faux student 2
		Student s2 = new Student();
		s2.setUserId(2);
		s2.setCredentials(new Credentials("mTishman2013", "student"));
		s2.setAdvisor(a1);
		s2.setTemplate(t1);
		
		ArrayList<Student> sList = new ArrayList<Student>() {{
			add (s1);
			add (s2);
		}};
		
		a1.setStudents(sList);
		
		userTable = new ArrayList<Users>() {{
			add (a1);
			add (s1);
			add (s2);
		}};
		
	}
	
	public Users validateUser (Credentials credentials) {
		for (Users user: userTable) {
			if (user.getCredentials().equals(credentials))
				return user;
		}
		
		return null;
	}


}
