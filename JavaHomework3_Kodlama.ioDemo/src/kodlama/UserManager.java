package kodlama;

public class UserManager {
	
	public void add(User user) {
		System.out.println("New user is added: " + user.firstName);
	}
	
	public String showName(User user) {
		return user.firstName + user.lastName;
	}
	
}
