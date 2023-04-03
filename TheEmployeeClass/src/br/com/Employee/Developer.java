package br.com.Employee;

public class Developer extends Employee {

	public Developer(int id, String firstName, String lastName, float salary) {
		super(id, firstName, lastName, salary);
	}
	
	public void analysing() {
		System.out.println(this.getName() + " is analysing the project...");
	}
	
	public void finilizeProject() {
		System.out.println(this.getName() + " is now testing the project...");
	}
	
	@Override
	public void work() {
		System.out.println(this.getName() + " is now coding...");
	}

	@Override
	public void rest() {
		System.out.println(this.getName() + " is now taking a coffee break...");
	}

}
