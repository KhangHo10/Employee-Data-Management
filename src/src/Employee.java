// Create an Employee class
public class Employee {
	// Create employee variable
	private String employeeID;
	private String name;
	private String department;
	private double salary;
	private String designation;
	// Create non-argument constructor, argument constructor that take and set employee ID, name, department, salary, and designation,
	// and argument constructor retrieve employee information from other Employee class and assign to current one.
	public Employee() {
		this("A0", "No Name", "N/A", 0.1, "N/A");
	}
	
	public Employee(String eID, String n, String dep, double s, String des) {
		setEmployeeID(eID);
		setEmployeeName(n);
		setEmployeeDepartment(dep);
		setEmployeeSalary(s);
		setEmployeeDesignation(des);
	}
	
	public Employee(Employee other) {
		this(other.getEmployeeID(), other.getEmployeeName(), other.getEmployeeDepartment(), other.getEmployeeSalary(), other.getEmployeeDesignation());
	}

	
	// Check and set employee information such as employee ID, name, department, salary,
	// and designation
	public void setEmployeeID(String eID) {
		if(eID.equals(null)) {
			System.out.println("Invalid employee ID!");
			System.exit(0);
		}
		employeeID = eID;
	}

	public void setEmployeeName(String n) {
		if(n.equals(null)) {
			System.out.println("Invalid employee name!");
			System.exit(0);
		}
		name = n;
	}

	public void setEmployeeDepartment(String dep) {
		if(dep.equals(null)) {
			System.out.println("Invalid employee department!");
			System.exit(0);
		}
		department = dep;
	}

	public void setEmployeeSalary(double s) {
		if((s <= 0)) {
			System.out.println("Invalid employee salary!");
			System.exit(0);
		}
		salary = s;
	}

	public void setEmployeeDesignation(String des) {
		if(des.equals(null)) {
			System.out.println("Invalid employee designation!");
			System.exit(0);
		}
		designation = des;
	}
	

	// Return employee information such as employee ID, name, department, salary,
    // and designation
	public String getEmployeeID() {
		return employeeID;
	}
	
	public String getEmployeeName() {
		return name;
	}
	
	public String getEmployeeDepartment() {
		return department;
	}
	
	public double getEmployeeSalary() {
		return salary;
	}
	
	public String getEmployeeDesignation() {
		return designation;
	}
	
	// Create a equals method to compare employee designation
	public String equals(Employee other) {
		if (designation.equals(other.getEmployeeDesignation())) {
			return name + " and " + other.getEmployeeName() + " have same designation.";
		}
		return name + " and " + other.getEmployeeName() + " have different designation.";
	}
	
	// Create a bonus method to add bonus to employee salary
	public double addBonus() {
		return (salary + 200);
	}
	//Create a display method to return all employee information
	public String display() {
		return "Employee ID: " + employeeID + "\n" + "Employee name: " + name + "\n" + "Department name: " + department + "\n" + "Salary: $" + salary + "\n" + "Designation: " + designation + "\n" + "Salary after adding the bonus is: $";
    }
	// Create a employee deduction method to calculate the amount of 
	// deduction an employee have
	public double getEmployeeDeduction() {
		return 0.0;
	}
}
