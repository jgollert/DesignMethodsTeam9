import java.util.ArrayList;


public class Advisor extends Users {

	private ArrayList<Student> students;
	private Credentials credentials;

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public Student getStudent(int studentId) {
		for (Student student : students) {
			if (studentId == student.getUserId())
				return student;
		}
		
		return null;
	}

}
