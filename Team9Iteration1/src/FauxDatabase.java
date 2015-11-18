import java.util.ArrayList;

// This is where we will store all of our faux data
public class FauxDatabase {
	
	private static FauxDatabase instance;
	
	private ArrayList<Users> userTable;
	private ArrayList<ProgramOfStudy> templateList;
	
	public static synchronized FauxDatabase getInstance() {
		if (instance == null)
			instance = new FauxDatabase();
		
		return instance;
	}
	
	public FauxDatabase () {
		templateList = new ArrayList<ProgramOfStudy>();
		
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
		ArrayList<Course> courseSetT2 = new ArrayList<Course>() {{
			add (new Course("CS1000", "Fall", 2012, 1));
			add (new Course("CS1001", "Fall", 2012, 2));
			add (new Course("CS1002", "Spring", 2013, 3));
			add (new Course("CS1003", "Spring", 2013, 4));
		
		}};
		
		ProgramOfStudy t1 = new ProgramOfStudy();
		t1.setCourses(courseSetT1);
		t1.setProgramName("Math");
		t1.setProgramYear(2012);
		
		ProgramOfStudy t2 = new ProgramOfStudy();
		t2.setCourses(courseSetT2);
		t2.setProgramName("Computer Science");
		t2.setProgramYear(2012);
		
		
		// Create our faux student 1
		Student s1 = new Student();
		s1.setUserId(1);
		s1.setCredentials(new Credentials("sroig2013", "student"));
		s1.setAdvisor(a1);
		s1.setProgram(t1);
		
		// Create our faux student 2
		Student s2 = new Student();
		s2.setUserId(2);
		s2.setCredentials(new Credentials("mtishman2013", "student"));
		s2.setAdvisor(a1);
		s2.setProgram(t2);
		
		Student s3 = new Student();
		s3.setUserId(3);
		s3.setCredentials(new Credentials("jgollert2013", "student"));
		s3.setAdvisor(a1);
		
		ArrayList<Student> sList = new ArrayList<Student>() {{
			add (s1);
			add (s2);
			add (s3);
		}};
		
		a1.setStudents(sList);
		
		userTable = new ArrayList<Users>() {{
			add (a1);
			add (s1);
			add (s2);
			add (s3);
		}};	
	}
	
	public void addTemplate(ProgramOfStudy template) {
		templateList.add(template);
	}
	
	public Users validateUser (Credentials credentials) {
		for (Users user: userTable) {
			if (user.getCredentials().equals(credentials))
				return user;
		}
		return null;
	}

	public boolean displayTemplates () {
		if(templateList.size() == 0) {
			System.out.println("There are no templates to give! Make one first");
			return false;
		} else {
			int i = 0;
			for (ProgramOfStudy template: templateList) {
				System.out.println(i + " " + template.shortString());
				i++;
			}
			return true;
		}
	}
	
	public ProgramOfStudy giveTemplate(int index) {
		if (index < 0 || index >= templateList.size()) {
			System.out.println("That id is invalid!");
			return null;
		} else {
			return templateList.get(index);
		}
	}
}
