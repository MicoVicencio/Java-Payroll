package Payroll;
import java.util.Scanner;
public class Main {
	static final String username = "admin";
	static final String password = "admin";

	public static void main(String[] args) {
	 Menu menu = new Menu();
	 Scanner scan = new Scanner(System.in);
	 String user;
	 String pass;
	 
	 System.out.println("\t\t\tWELCOME TO PAYROLL SYSTEM");
	 System.out.println("\t\t\t   LOG IN TO CONTINUE\n\n\n\n");
	 for(int i = 0; i<3; i++) {
		 System.out.print("\t\t\t Username:");
		 user = scan.nextLine();
		 System.out.print("\t\t\t Password:");
		 pass = scan.nextLine();
		 if(user.equalsIgnoreCase(username)) {
			 if(pass.equalsIgnoreCase(password)) {
				 menu.EmployeeInfo();
				 break;
			 }
			 else{
				 System.out.println("\t\t\t Invalid Password! Try again.");
				 if(i == 3) {
					 System.out.println("\t\t\t Attempetd 3 times!");
					 System.out.println("\t\t\t The Prorgam will now Exit!");
					 return;
					 }
			 }
		 }
		 else{
			 System.out.println("\t\t\t Invalid Username! Try again.");
			 if(i == 3) {
				 System.out.println("\t\t\t Attempetd 3 times!");
				 System.out.println("\t\t\t The Prorgam will now Exit!");
				 return;
				 }
		 }
		 
	 }
	 
	 
	}
	

}
