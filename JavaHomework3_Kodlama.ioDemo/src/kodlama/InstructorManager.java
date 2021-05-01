package kodlama;

public class InstructorManager extends UserManager{ 	// Inheritance
	
	public void addCourses(Instructor instructor) {
		System.out.println(instructor.firstName + "added a new course.");
	}
	
	// Override
	public void showName(Instructor instructor) {
		System.out.println("Student name is " + instructor.firstName + " " + instructor.lastName);
	}
}
