package Payroll;

public class Calculator {
          String firstname,lastname,age,job,position;
          int days_of_working, overtime;
          float regularTax;
          float irregularTax;
          int r_salary;
          int ir_salary;
          float f_salary;
          
          Calculator(String firstname, 
        		  String lastname,
        		  String age, String job,
        		  String position,
        		  int days_of_working,
        		  int overtime,
        		  float regularTax,
        		  float irregularTax,
        		  int r_salary,
        		  int ir_salary,
        		  float f_salary)
          {
        	  this.firstname = firstname;
        	  this.lastname = lastname;
        	  this.age = age;
        	  this.job = job;
        	  this.position = position;
        	  this.days_of_working = days_of_working;
        	  this.overtime = overtime;
        	  this.regularTax = regularTax;
        	  this.irregularTax = irregularTax;
        	  this.r_salary = r_salary;
        	  this.ir_salary = ir_salary;
          }
          
          
          float RCompute(int days_of_working, int r_salary, int overtime, float f_salary, float regularTax) {
        	  f_salary = days_of_working * r_salary;
        	  overtime = overtime * 40;
        	  f_salary = f_salary + overtime;
        	  regularTax = (float)(f_salary*(regularTax/100.0f));
        	  f_salary = f_salary - regularTax;
        	  return f_salary;
          }
          float IRcompute(int days_of_working, int ir_salary, int overtime, float f_salary, float irregularTax) {
        	  f_salary = days_of_working * r_salary;
        	  overtime = overtime * 20;
        	  f_salary = f_salary + overtime;
        	  irregularTax =(float)(f_salary*(irregularTax/100.0f));
        	  f_salary = f_salary - irregularTax;
        	  return f_salary;
          }
          void Rlist() {
        	  System.out.println("\t\t\t Salary per Day: " + r_salary);
        	  System.out.println("\t\t\t Tax: " + regularTax + "%");
        	  f_salary = RCompute(days_of_working, r_salary, overtime, f_salary, regularTax);
        	  System.out.println("\t\t\t Final Salary: Php"+ f_salary);
        	  System.out.println("\t\t\t =========================================");
          }
          void IRlist() {
        	  System.out.println("\t\t\t Salary per Day: " + ir_salary);
        	  System.out.println("\t\t\t Tax: " + irregularTax + "%");
        	  f_salary = IRcompute(days_of_working, ir_salary, overtime, f_salary, irregularTax);
        	  System.out.println("\t\t\t Final Salary: Php"+ f_salary);
        	  System.out.println("\t\t\t =========================================");
          }
          void printing() {
        	  System.out.println("\t\t\t =========================================");
        	  System.out.println("\t\t\t Name: " +firstname + " " + lastname);
        	  System.out.println("\t\t\t Age: " + age);
        	  System.out.println("\t\t\t Job: " + job);
        	  System.out.println("\t\t\t Position: " + position);
        	  System.out.println("\t\t\t Number of days working: " + days_of_working);
        	  System.out.println("\t\t\t Overtime Hours: " + overtime);	  
          }
        	  
}
          

