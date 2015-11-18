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
	
	public void viewStudentProgram(Scanner sc) {
		
		System.out.println("Which student's template would you like to see? \n");
		
		for (Student student : this.students) {
			System.out.println(student.getUserId() + ". " + student.getCredentials().getUserName());
		}
		
		System.out.print("Please enter the student's id: ");
		
		Student currentStudent = getStudent(sc.nextInt());
		
		System.out.println();
		
		if (currentStudent == null) {
			System.out.print("That student doesn't exist!");
		} else {
			currentStudent.showProgram();
		}
		
	}
	
	public void modifyStudentProgram(Scanner sc) {
		// Show advisor list of students
		System.out.println("Which student's template would you like to modify?");
		
		for (Student student : students) {
			System.out.println(student.getUserId() + ". " + student.getCredentials().getUserName());
		}
		
		System.out.println();
		
		System.out.print("Please enter the student's id: ");
		
		Student currentStudent = getStudent(sc.nextInt());
		
		System.out.println();
		
		if (currentStudent == null) {
			System.out.println("That student doesn't exist!");
		} else {
			Boolean programCheck = currentStudent.showProgram();
			
			if (programCheck == true) {
				
				System.out.print("Which class would you like to replace? Please enter the course id: ");
				
				int oldId = sc.nextInt();
					
				System.out.print("\nEnter new course id: ");
				
				int newId = sc.nextInt();

				System.out.print("\nEnter new course name: ");
				
				String courseName = sc.next();
				
				System.out.print("\nEnter new course semester: ");
				
				String semester = sc.next();
				
				System.out.print("\nEnter new course year: ");
				
				int year = sc.nextInt();
				
				Course replacementCourse = new Course(courseName, semester, year, newId);
						
				currentStudent.getProgram().replaceCourse(replacementCourse, oldId);
			}
		}
	}
	
	public Student getStudent(int studentId) {
		for (Student student : students) {
			if (studentId == student.getUserId())
				return student;
		}
		
		return null;
	}

	public void giveStudentProgram(Scanner sc) {
		System.out.println("Which student would you like to give a new Program to?");
		
		for (Student student : students) {
			System.out.println(student.getUserId() + ". " + student.getCredentials().getUserName());
		}
		
		System.out.println();
		
		System.out.print("Please enter the student's id: ");
		
		Student currentStudent = getStudent(sc.nextInt());
		
		System.out.println();
		
		if (currentStudent == null) {
			System.out.print("That student doesn't exist!");
		} else {
			boolean templateCheck = FauxDatabase.getInstance().displayTemplates();
			if (templateCheck) {
				System.out.print("Please enter the id of the template you want to give: ");
				int index = sc.nextInt();
				
				ProgramOfStudy newProgram = FauxDatabase.getInstance().giveTemplate(index);
				if (newProgram != null) {
					currentStudent.setProgram(newProgram);
				}
			}
		}
	}

	public void createProgramTemplate(Scanner sc) {
		ProgramOfStudy template = new ProgramOfStudy();
		
		System.out.print("Enter the program name for the template: ");
		String name = sc.next();
		template.setProgramName(name);
		
		System.out.print("Enter the program year: ");
		int year = sc.nextInt();
		template.setProgramYear(year);
		
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
			
			Course newCourse = new Course(courseName, semester, courseYear, id);
			courses.add(newCourse);
			
			System.out.println();
			System.out.println("Would you like to add another course?");
			System.out.print("Enter 1 for yes or another integer for no: ");
			selection = sc.nextInt();
			
		}while (selection == 1);
		
		template.setCourses(courses);
		
		FauxDatabase.getInstance().addTemplate(template);
	}

}
