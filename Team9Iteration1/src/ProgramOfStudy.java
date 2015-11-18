import java.util.ArrayList;


public class ProgramOfStudy {
	
	private ArrayList<Course> courses;
	private int programYear;
	private String programName;
	
	public ArrayList<Course> getCourses() {
		return courses;
	}
	
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	public void replaceCourse (Course replacementCourse, int oldCourseId) {
		
		for (Course course : courses) {
			if (course.getCourseId() == oldCourseId) {
				courses.remove(course);
				courses.add(replacementCourse);
				break;
			}
		}
		
	}
	
	public int getProgramYear() {
		return programYear;
	}
	
	public void setProgramYear(int programYear) {
		this.programYear = programYear;
	}
	
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	
	@Override
	public String toString() {
		
		String str = "";
		
		str += "Program: " + programName + " Year: " + programYear + "\n\n";
		
		for (Course course: courses) {
			str += course + "\n";
		}
		
		
		return str;
	}
	
public String shortString() {
		
		String str = "";
		
		str += "Program: " + programName + " Year: " + programYear + "\n\n";
		
		return str;
	}
	
}
