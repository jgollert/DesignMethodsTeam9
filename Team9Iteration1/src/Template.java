import java.util.ArrayList;


public class Template {
	
	private ArrayList<Course> courses;
	private int templateYear;
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
	
	public int getTemplateYear() {
		return templateYear;
	}
	
	public void setTemplateYear(int templateYear) {
		this.templateYear = templateYear;
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
		
		str += programName + " " + templateYear + "\n\n";
		
		for (Course course: courses) {
			str += course + "\n";
		}
		
		
		return str;
	}
	
	
	
}
