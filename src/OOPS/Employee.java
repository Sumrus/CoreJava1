package OOPS;

public class Employee {
	
	String Name;
	int EmployeeId;
	int Salary;
	
	//Constructor//
	
	public Employee() {
		
		Name = "Nitish";
		EmployeeId = 23456;
		Salary = 3000;
		
		
	}
	
	public Employee(String Name, int EmployeeId, int Salary) {
		
		this.Name = Name;
		this.EmployeeId = EmployeeId;
		this.Salary = Salary;
		
	}
	
	public void PrintName() {
		
		System.out.println("Name of employee is " + this.Name);
	}
	
}
