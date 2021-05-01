package kodlama;

public class StudentManager extends UserManager{ 	// Inheritance
	
	public void joinACourse(Student student) {
		System.out.println("Joined the course.");
	}
	
	// Override
	public void showName(Student student) {
		System.out.println("Student name is " + student.firstName + " " + student.lastName);
	}
}
