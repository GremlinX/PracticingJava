package br.com.Employee;

public abstract class Employee {
	protected int id;
	protected String firstName;
	protected String lastName;
	protected float salary;
	
	public Employee(int id, String firstName, String lastName, float salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getName() {
		return (this.firstName + " " +  this.lastName);
	}
	
	public float getSalary() {
		return this.salary;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public float getAnnualSalary() {
		return this.salary * 12;
	}
	
	public float raiseSalary(float percent) {
		return (this.salary * percent) / 100;
	}
	
	public abstract void work();
	public abstract void rest();
	
	@Override
	public String toString() {
		return "Employee[id = " + this.id 
				+ ", name = " + this.firstName + " " +  this.lastName 
				+ ", salary = " + this.salary 
				+ "]";
	}
}
