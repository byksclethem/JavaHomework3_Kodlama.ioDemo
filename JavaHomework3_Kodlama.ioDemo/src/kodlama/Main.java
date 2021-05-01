package kodlama;

public class Main {

	public static void main(String[] args) {
		UserManager userManagers[] = new UserManager[] {new StudentManager() , new InstructorManager()}; 
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		

		
		Student student1 = new Student("Ethem" , "Büyüksaçlý" , 21 , "abc@gmail.com" , 182 , "KGTÜ");

		
		studentManager.add(student1);	// Ortak Classtan gelen metot.
		studentManager.joinACourse(student1); 	//Student classýna özgü class. 
		studentManager.showName(student1); 		// Override metot.
		
		
		
		Instructor instructor1 = new Instructor("Engin" , "Demiroð" , 28 , "demirog@gmail.com" , 384 , "ODTÜ");
		
		instructor1.firstName = "Engin ";
		instructor1.lastName = "Demiroð";
		
		instructorManager.add(instructor1);		// Ortak classtan gelen metot.
		instructorManager.addCourses(instructor1);		// Instructor calassýna özgü class.
		instructorManager.showName(instructor1); 		// Override metot.
		
	}

}
