package br.com.Employee;

public class Main {

	public static void main(String[] args) {
		Recepcionist r1 = new Recepcionist(1, "Robert", "Java", 3000.0f);
		Developer d1 = new Developer(2, "Diona", "Cobol", 3000.0f);
		
		r1.answerCall();
		r1.makeCall();
		r1.work();
		r1.rest();
		
		d1.analysing();
		d1.work();
		d1.finilizeProject();
		d1.rest();
	}

}
