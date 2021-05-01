package kodlama;

public class Student extends User{			// Inheritance
	int id;
	String school;
	
	public Student(String firstName, String lastName, int age, String mail, int id, String school) {
		super(firstName, lastName, age, mail);
		this.id = id;
		this.school = school;
	
	}
		
}
