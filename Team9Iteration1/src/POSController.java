import java.util.ArrayList;
import java.util.Scanner;


public class POSController {

	private static int selection = 0;
	private static Scanner sc = new Scanner(System.in);
	private static Users currentUser;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub		
		
	
	}
	
	private static Users Login() {
		Credentials credentials = new Credentials();
		
		System.out.println("Please Login");
		System.out.print("Username: ");
		credentials.setUserName(sc.next());
		System.out.print("Password:" );
		credentials.setPassword(sc.next());
		
		return null;
	}
	
	// This would make a call to banner to authenticate user and return
	// 1 is advisor
	// 0 is student
	// -1 the user does not exist
	// This is a faux class
	private static int authenticateUser(Credentials credentials) {
		// Represents database of advisors
		ArrayList<Credentials> advisorCredentials = new ArrayList<Credentials>() {{
			add(new Credentials("pBond", "admin"));
			add(new Credentials("wShoaff", "admin"));
			add(new Credentials("pBernhard", "admin"));
		}};
		
		// Represents database of students
		ArrayList<Credentials> studentCredentials = new ArrayList<Credentials>() {{
			add(new Credentials("jGollert", "student"));
			add(new Credentials("sRoig", "student"));
			add(new Credentials("mTishman", "student"));
		}};
		
		if (advisorCredentials.contains(credentials))
			return 1;
		else if (studentCredentials.contains(credentials))
			return 0;
		
		// If user is not in DB then we shall return -1
		return -1;
		
	}
	
	private void DisplayStudentMenu()
	{
		System.out.println("1. View Template\n-1. Logout\n");
		selection = sc.nextInt();
	}
	
	private void DisplayAdvisorMenu()
	{
		System.out.println("1. View Template\n2. Modify Template\n-1. Logout\n");
		selection = sc.nextInt();
		
		
	}

}
