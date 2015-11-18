import java.util.Scanner;


public class POSController {

	private static int selection = -1;
	private static Scanner sc = new Scanner(System.in);
	private static Users currentUser;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub		
		
		// First login
		// If student 
		// 1. Display student menu
		
		currentUser = Login();
		
		if (currentUser == null) {
			// User isn't found
			System.out.println("User not found!");
		} else {
			
			// Since the database returned a user let's begin our program loop
			while (selection != 0)
			{				
				if (currentUser instanceof Advisor) {
					// Do advisor things
					DisplayAdvisorMenu();
					
				} else {
					// Do student things
					DisplayStudentMenu();
				}
			}
		}
	}
	
	private static Users Login() {
		Credentials credentials = new Credentials();
		
		// Login our user
		System.out.println("Please Login\n");
		System.out.print("Username: ");
		credentials.setUserName(sc.next());
		System.out.print("Password: " );
		credentials.setPassword(sc.next());
		System.out.println();
		
		return FauxDatabase.getInstance().validateUser(credentials);
	}
	
	private static void DisplayStudentMenu()
	{
		System.out.println("1. View Program\n0. Logout\n");
		System.out.print("Please enter an action id: ");
		selection = sc.nextInt();
		
		System.out.println();
		
		if (selection == 1) {
			((Student) currentUser).showProgram();
		} else if (selection != 0) {
			System.out.println("Invalid selection!");
		}
	}
	
	private static void DisplayAdvisorMenu()
	{
		System.out.println("1. View Program\n2. Modify Program\n3. Give Student New Program\n4. Create Program Template\n0. Logout\n");
		System.out.print("Please enter an action id: ");
		selection = sc.nextInt();
		
		System.out.println();
		
		if (selection == 1) {
			// If advisor
			// 1. View Program - Give list of advisor's students and their corresponding id
			// 2. Modify Program 
			// 3. Give student new Program
			// 4. Create template
			
			((Advisor) currentUser).viewStudentProgram(sc);

			
		} else if (selection == 2) {
			((Advisor) currentUser).modifyStudentProgram(sc);			
		} else if (selection == 3) {
			((Advisor) currentUser).giveStudentProgram(sc);
		} else if (selection == 4) {
			((Advisor) currentUser).createProgramTemplate(sc);
		} else if (selection != 0) {
			System.out.println("Invalid selection!");
		} 
	}

}
