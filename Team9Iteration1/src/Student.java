
public class Student extends Users{

	private Advisor advisor;
	
	public Student(Credentials _credentials, Advisor _advisor) {
		super(_credentials, false);
		this.advisor = _advisor;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void viewTemplate(int studentId) {
		// TODO Auto-generated method stub
		
	}

}
