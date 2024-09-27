// Create a sub-class that extends from Employee
public class Clerk extends Employee{
	// Create manager variable
	private int presentDayClerk;
	private int absentDayClerk;
	//Create an argument constructor that take employee ID, Name, Department, Salary, and Designation
	public Clerk(String eID, String n, String dep, double s, String des) {
		super.setEmployeeID(eID);
		super.setEmployeeName(n);
		super.setEmployeeDepartment(dep);
		super.setEmployeeSalary(s);
		super.setEmployeeDesignation(des);
	}
	// Create a bonus method to add bonus to employee salary
	public double addBonus() {
		return (super.getEmployeeSalary() + 100);
	}
	
	//Create a display method to return all employee information
	public String display() {
		return super.display() + addBonus() + "\n";
	}
	
	// Assign employee present and absent day into class variable
	public void setDayClerk(int pDay) {
		if ((pDay > 20) || (pDay < 0)) {
			System.out.println("Invalid employee present day at office!");
			System.exit(0);
		}
		presentDayClerk = pDay;
		absentDayClerk = 20 - pDay;
	}
	
	// Return employee deduction amount, present, and absent day
	public double getEmployeeDeduction() {
		return ((addBonus() * 0.05) * absentDayClerk);
	}
	
	public int getClerkPresentDay() {
		return presentDayClerk;
	}
	
	public int getClerkAbsentDay() {
		return absentDayClerk;
	}
}
