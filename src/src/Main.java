// Create a Main class
// Import java.util package and Scanner class
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Create a Scanner object, an array to store employee deduction amount,
		// and a total employees deduction
		Scanner sc = new Scanner(System.in);
		int[] deduction = new int[3];
		double totalDeduction = 0;
		
		// Create objects for manager and clerk class
		Manager m1 = new Manager("E001", "Mark", "HR", 15000, "Manager");
		Manager m2 = new Manager("E012", "Peter", "R&D", 15000, "Manager");
		
		Clerk c1 = new Clerk("E056", "Samual", "Accounts", 10000, "Clerk");
		
		// Display employees information
		System.out.print(m1.display() + "\n");
		System.out.print(m2.display() + "\n");
		System.out.print(c1.display() + "\n");
		
		// Display the comparison in employee designation
		System.out.println("\n" + m1.equals(c1) + "\n");
		
		// Ask user's about the employee present day and store it in the following employee class
		System.out.println("Enter the number of days employee " + m1.getEmployeeID() + " is present out of 20: ");
		m1.setDayManager(sc.nextInt());
		System.out.println("Enter the number of days employee " + m2.getEmployeeID() + " is present out of 20: ");
		m2.setDayManager(sc.nextInt());
		System.out.println("Enter the number of days employee " + c1.getEmployeeID() + " is present out of 20: ");
		c1.setDayClerk(sc.nextInt());
		
		// Assign values into deduction array
		deduction[0] = (int)m1.getEmployeeDeduction();
		deduction[1] = (int)m2.getEmployeeDeduction();
		deduction[2] = (int)c1.getEmployeeDeduction();
		
		// Return employee ID, present day, absent day, and deduction amount
		System.out.println("\n" + "Employee ID" + "\t" + "Present" + "\t" + "Absent" + "\t" + "Deduction" + "\n");
		System.out.println(m1.getEmployeeID() + "\t\t" + m1.getManagerPresentDay() + "\t" + m1.getManagerAbsentDay() + "\t $" + m1.getEmployeeDeduction());
		System.out.println(m2.getEmployeeID() + "\t\t" + m2.getManagerPresentDay() + "\t" + m2.getManagerAbsentDay() + "\t $" + m2.getEmployeeDeduction());
		System.out.println(c1.getEmployeeID() + "\t\t" + c1.getClerkPresentDay() + "\t" + c1.getClerkAbsentDay() + "\t $" + c1.getEmployeeDeduction());
		
		// Add all employees deduction amount
		for(int i = 0; i < 3; i++) {
			totalDeduction += deduction[i];
		}
		
		// Display all employees deduction amount
		System.out.println("\n" + "Total Deduction: $" + totalDeduction);
	}

}
