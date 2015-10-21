import java.util.Scanner;


public class POSController {

	private static int selection = 0;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int login = Login();
		
		
	
	}
	
	private static int Login() {
		Credentials credentials = new Credentials();
		
		System.out.println("Please Login");
		System.out.print("Username: ");
		credentials.setUserName(sc.next());
		System.out.print("Password:" );
		credentials.setPassword(sc.next());
		
		return 0;
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
