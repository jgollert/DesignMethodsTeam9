import java.util.ArrayList;


public class Advisor extends Users {

	private ArrayList<Student> students;
	private Credentials credentials;
	
	public Advisor(Credentials _credentials, ArrayList<Student>_students) {
		super(_credentials, true);
		this.students = _students;
	}
	
	@Override
	public void viewTemplate(int studentId) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean updateTemplate() {
		return true;
	}
	
	public void getStudentListFromDB() {
		
	}

}
