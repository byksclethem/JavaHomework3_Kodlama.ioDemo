package kodlama;

public class Instructor extends User{	 	// Inheritance
	int numberOfCourse;
	String job;
	
	public Instructor(String firstName, String lastName, int age, String mail, int numberOfCourse, String job) {
		super(firstName, lastName, age, mail);
		this.numberOfCourse = numberOfCourse;
		this.job = job;
	}
	
}
