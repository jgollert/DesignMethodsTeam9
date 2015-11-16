import java.util.ArrayList;
import java.util.Scanner;


public class Advisor extends Users {

	private ArrayList<Student> students;
	private Credentials credentials;

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public void viewStudentTemplate(Scanner sc) {
		
		System.out.println("Which student's template would you like to see? \n");
		
		for (Student student : this.students) {
			System.out.println(student.getUserId() + ". " + student.getCredentials().getUserName());
		}
		
		System.out.println(getStudent(sc.nextInt()).showTemplate());
	}
	
	public void updateStudentTemplate(Scanner sc) {
		// Show advisor list of students
		System.out.println("Which student's template would you like to modify? \n");
		
		for (Student student : students) {
			System.out.println(student.getUserId() + ". " + student.getCredentials().getUserName());
		}
		
		Student currentStudent = getStudent(sc.nextInt());
		
		System.out.println( currentStudent.showTemplate());
		
		System.out.println("Which class would you like to replace?");
		
		int id = sc.nextInt();
				
		System.out.println("\nEnter new course name: ");
		
		String courseName = sc.next();
		
		System.out.println("\nEnter new course semester: ");
		
		String semester = sc.next();
		
		System.out.println("\nEnter new course year: ");
		
		int year = sc.nextInt();
		
		Course replacementCourse = new Course(courseName, semester, year, id);
				
		currentStudent.getTemplate().replaceCourse(replacementCourse, id);
	}
	
	public void createTemplate (Scanner sc) {
		
		System.out.print("Enter the program name for the template: ");
		String name = sc.next();
		
		System.out.print("Enter the program year: ");
		int year = sc.nextInt();
		
		ArrayList<Course> courses = new ArrayList<Course>();
		int selection = 1;
		do {
			System.out.print("Enter a name for your course: ");
			String courseName = sc.next();
			
			System.out.print("Enter the course semester: ");
			String semester = sc.next();
			
			System.out.print("Enter the course year: ");
			int courseYear = sc.nextInt();
			
			System.out.print("Enter the course id: ");
			int id = sc.nextInt();
			
			
			
			
		}while (selection == 1);
	}
	
	public void assigntStudentTemplate (Scanner sc) {
		
	}
	
	public Student getStudent(int studentId) {
		for (Student student : students) {
			if (studentId == student.getUserId())
				return student;
		}
		
		return null;
	}

}
