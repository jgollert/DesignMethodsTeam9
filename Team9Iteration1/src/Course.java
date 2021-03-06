
public class Course {
	
	private String courseName;
	private String semester;
	private int year;
	private int courseId;
	
	public Course(String _courseName, String _semester, int _year, int _courseId) {
		this.courseName = _courseName;
		this.semester = _semester;
		this.year = _year;
		this.courseId = _courseId;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getSemester() {
		return semester;
	}
	
	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	@Override
	public String toString() {
		return "Id: " + courseId + " Semester: " + semester + " Year: " + year + " Course: " + courseName;
	}
	
}
