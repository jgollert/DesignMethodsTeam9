import java.util.ArrayList;


public class Advisor extends Users {

	private ArrayList<Student> students;
	
	public Advisor(ArrayList<Student> _students)
	{
		this.students = _students;
	}
	
	@Override
	public void viewTemplate(int studentId) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean updateTemplate() {
		return true;
	}

}
