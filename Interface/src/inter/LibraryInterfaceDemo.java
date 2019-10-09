package inter;

public class LibraryInterfaceDemo {
	
	public static void main(String args[]) {
		
		KidUsers kid = new KidUsers();
		AdultUsers adult = new AdultUsers();
		
		kid.age=10;
		kid.registerAccount();
		
		kid.age=18;
		kid.registerAccount();
		
		kid.bookType = "Kids";
		kid.requestBook();
		
		kid.bookType = "Fiction";
		kid.requestBook();
		
		adult.age=5;
		adult.registerAccount();
		
		adult.age=23;
		adult.registerAccount();
		
		adult.bookType="Kids";
		adult.requestBook();
		
		adult.bookType="Fiction";
		adult.requestBook();

	}
}
