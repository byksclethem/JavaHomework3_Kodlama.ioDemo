package kodlama;

public class Main {

	public static void main(String[] args) {
		UserManager userManagers[] = new UserManager[] {new StudentManager() , new InstructorManager()}; 
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		

		
		Student student1 = new Student("Ethem" , "B�y�ksa�l�" , 21 , "abc@gmail.com" , 182 , "KGT�");

		
		studentManager.add(student1);	// Ortak Classtan gelen metot.
		studentManager.joinACourse(student1); 	//Student class�na �zg� class. 
		studentManager.showName(student1); 		// Override metot.
		
		
		
		Instructor instructor1 = new Instructor("Engin" , "Demiro�" , 28 , "demirog@gmail.com" , 384 , "ODT�");
		
		instructor1.firstName = "Engin ";
		instructor1.lastName = "Demiro�";
		
		instructorManager.add(instructor1);		// Ortak classtan gelen metot.
		instructorManager.addCourses(instructor1);		// Instructor calass�na �zg� class.
		instructorManager.showName(instructor1); 		// Override metot.
		
	}

}
