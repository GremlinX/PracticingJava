package br.com.Employee;

public class Recepcionist extends Employee {

	public Recepcionist(int id, String firstName, String lastName, float salary) {
		super(id, firstName, lastName, salary);
	}
	
	public void answerCall() {
		System.out.println(this.getName() + " is answering the new call...");
	}
	
	public void makeCall() {
		System.out.println(this.getName() + " is now calling a client...");
	}

	@Override
	public void work() {
		System.out.println(this.getName() + " is now working...");
	}

	@Override
	public void rest() {
		System.out.println(this.getName() + " is now resting...");
	}
	
}
