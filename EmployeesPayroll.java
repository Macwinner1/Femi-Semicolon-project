import java.util.Scanner;
import java.util.Arrays;
public class EmployeesPayroll{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
String menu = """

	Welcome to semicolon Employees Payroll:
	
	1. Add Employees Payroll
	2. View Employees Payroll
	3. Update Employee Payroll
		4. Exit
		
	""";
int[][] list_of_employees = new int[1][3];
String[][] employee_details = new String[1][3];
boolean exit = true;
while(exit){
	System.out.print(menu);
	String option = input.nextLine();
	switch(option){
		case "1":
		
			System.out.print("Enter Employees Name: ");
			String name = input.nextLine();
			System.out.print("Enter number of hours worked in a week: ");
			double hours = input.nextDouble();
			System.out.print("Enter hourly pay rate: ");
			double rate = input.nextDouble();
			System.out.print("Enter federal tax withholding rate: ");
			double federal = input.nextDouble();
			System.out.print("Enter state tax withholding rate: ");
			double state = input.nextDouble();

			if(hours > 168){
				System.out.print("hours above weekly hours");
			}
			else{
				double gross_pay = hours * rate;
				double federal_due = gross_pay * (federal / 100);
				double state_due = gross_pay * (state / 100);
				double total_tax = federal_due + state_due;
				double net_pay = gross_pay - total_tax;
				System.out.print("Name: " + name + " " + "Hours worked: " + hours + " " + "Gross pay: " + gross_pay + " " + "Federal Tax: " + federal_due + " " + "State Tax: " + state_due + " " + "Total tax: " + total_tax + " " + "Net pay:" + net_pay);
			}
		case "2":
			exit = false;
			
		}
	}	
}
}
