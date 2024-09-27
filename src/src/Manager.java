// Create a sub-class that extends from Employee
public class Manager extends Employee{
	// Create manager variable
	private int presentDayManager;
	private int absentDayManager;
	//Create an argument constructor that take employee ID, Name, Department, Salary, and Designation
	public Manager(String eID, String n, String dep, double s, String des) {
		super.setEmployeeID(eID);
		super.setEmployeeName(n);
		super.setEmployeeDepartment(dep);
		super.setEmployeeSalary(s);
		super.setEmployeeDesignation(des);
	}
	
	// Create a bonus method to add bonus to employee salary
	public double addBonus() {
		return (super.getEmployeeSalary() + 300);
	}
	
	// Create a display method to return all employee information
	public String display() {
		return super.display() + addBonus() + "\n";
	}
	
	// Assign employee present and absent day into class variable
	public void setDayManager(int pDay) {
		if ((pDay > 20) || (pDay < 0)) {
			System.out.println("Invalid employee present day at office!");
			System.exit(0);
		}
		presentDayManager = pDay;
		absentDayManager = 20 - pDay;
	}
	
	// Return employee deduction amount, present, and absent day
	public double getEmployeeDeduction() {
		return ((addBonus() * 0.05) * absentDayManager);
	}
		
	public int getManagerPresentDay() {
		return presentDayManager;
	}
		
	public int getManagerAbsentDay() {
		return absentDayManager;
	}
}
