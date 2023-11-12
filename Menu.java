package Payroll;
import java.util.Scanner;
public class Menu {
	static int Employee_num;
	int r_salary = 750;
	int ir_salary = 500;
	float irregularTax = 5.0f;
	float regularTax = 3.0f;
	Calculator calculator[] = new Calculator[Employee_num];
	static String firstname[] = new String[Employee_num];
	static String lastname[] = new String [Employee_num];
	static String age[] = new String [Employee_num];
	static String job[] = new String[Employee_num];
	static String position[] = new String[Employee_num];
	int days_of_working[] =new int[Employee_num];
	int overtime[] = new int[Employee_num];
	float f_salary[] = new float[Employee_num];
	int numcount = 1;
	
	
	public void EmployeeInfo() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\n\n");
		System.out.println("\t\t =========================================");
		System.out.print("\t\t Enter how many employee do you want to list: ");
		Employee_num = scan.nextInt();
		 String firstname[] = new String[Employee_num];
		 String lastname[] = new String [Employee_num];
		 String age[] = new String [Employee_num];
		 String job[] = new String[Employee_num];
		 String position[] = new String[Employee_num];
		float f_salary[] = new float[Employee_num];
		int days_of_working[] =new int[Employee_num];
		int overtime[] = new int[Employee_num];
		scan.nextLine();
		System.out.println("\n\n\n");
		for(int x = 0; x < Employee_num; x++) {
		
		System.out.println("\t\t =========================================");
		System.out.println("\t\t\t ENTER DETAILS OF THE EMPLOYEE#" + numcount);
		numcount++;
		System.out.print("\t\t\t FirstName:");
		firstname[x] = scan.nextLine();
		System.out.print("\t\t\t LastName:");
		lastname[x] = scan.nextLine();
		System.out.print("\t\t\t Age:");
		age[x] = scan.nextLine();
		System.out.print("\t\t\t Job:");
		job[x] = scan.nextLine();
		System.out.print("\t\t\t Position(Regular or Irregular):");
		position[x] = scan.nextLine();
		System.out.print("\t\t\t Enter number of days working:");
		days_of_working[x] = scan.nextInt();
		scan.nextLine();
		System.out.print("\t\t\t Total hours of Overtime:");
		overtime[x] = scan.nextInt();
		scan.nextLine();
		}
		System.out.println("\n\n\n");
		System.out.println("\t\t\t=========================================");
		System.out.println("\t\t\tList of Employees");
		for(int counter = 0; counter < Employee_num; counter++) {
			EmployeeSalary(firstname[counter], lastname[counter], age[counter], job[counter], position[counter], days_of_working[counter], overtime[counter], f_salary[counter]);
			
			
		}
		
		
	}
	
    void EmployeeSalary(String firstname, String lastname, String age, String job, String position, int days_of_working, int overtime, float f_salary){
      System.out.println("\t\t\t =========================================");
	  System.out.println("\t\t\t Name: " +firstname + " " + lastname);
	  System.out.println("\t\t\t Age: " + age);
	  System.out.println("\t\t\t Job: " + job);
	  System.out.println("\t\t\t Position: " + position);
	  System.out.println("\t\t\t Number of days working: " + days_of_working);
	  System.out.println("\t\t\t Overtime Hours: " + overtime);
	  if(position.equalsIgnoreCase("Regular")) {
		  f_salary = days_of_working * r_salary;
    	  overtime = overtime * 40;
    	  f_salary = f_salary + overtime;
    	  int FregularTax = (int)(f_salary*(regularTax/100.0f));
    	  f_salary = f_salary - FregularTax;
    	  System.out.println("\t\t\t Salary per Day: " + r_salary);
    	  System.out.println("\t\t\t Tax: " + regularTax + "%");
    	  System.out.println("\t\t\t Final Salary: Php"+ f_salary);
    	  System.out.println("\t\t\t =========================================");
	  }
	  else if(position.equalsIgnoreCase("irregular")) {
		  f_salary = days_of_working * r_salary;
    	  overtime = overtime * 20;
    	  f_salary = f_salary + overtime;
    	  int FirregularTax =(int)(f_salary*(irregularTax/100.0f));
    	  f_salary = f_salary - FirregularTax;
    	  System.out.println("\t\t\t Salary per Day: " + ir_salary);
    	  System.out.println("\t\t\t Tax: " + irregularTax + "%");
    	  System.out.println("\t\t\t Final Salary: Php"+ f_salary);
    	  System.out.println("\t\t\t =========================================");
	  }
    	
    	
    }	
}
