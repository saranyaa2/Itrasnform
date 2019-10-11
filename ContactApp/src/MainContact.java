import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainContact {
	
	List<Contact> MainContact = new ArrayList<>();
	
	private int top = 0;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		MainContact contact = new MainContact();
		
		BufferedReader keyIn;
        keyIn = new BufferedReader(new InputStreamReader(System.in));
		String choice = "";
		while(true) {
			System.out.println("Enter the choice");
			System.out.println("1.Add Contact");
			System.out.println("2.View All contacts");	
			System.out.println("3.Quit");
						
			try {
				choice =keyIn.readLine();
			}
			catch(Exception e) {
				System.out.println("Error");
			}
			switch(choice){
				case "1":
					contact.addContact();
					break;
				case "2":
					contact.viewContact();
					break;
				case "3":
					System.out.println("Successfully Exit");
					System.exit(0);
					break;
				default:
					System.out.println("Error");
					break;
				}
		}
	}
			
	private void viewContact() {
		// TODO Auto-generated method stub
		for (int index = 0; index < top; index++) {
	        MainContact.get(index).viewContact();
	        }
		
	}

	
	public MainContact() {
        this.MainContact = new ArrayList<>();
    }

	private void addContact() throws Exception {
		// TODO Auto-generated method stub
		BufferedReader keyIn;
        keyIn = new BufferedReader(new InputStreamReader(System.in));
        String firstName;
        String lastName;
        String address;
        String phoneNum;
        String dateOfBirth;
 
        Scanner input = new Scanner(System.in);
                  
            System.out.print("First Name: ");
            firstName = keyIn.readLine();
            System.out.print("Last Name: ");
            lastName = keyIn.readLine();
            System.out.print("Address: ");
            address = keyIn.readLine();
            System.out.print("Phone number: ");
            phoneNum = keyIn.readLine();
            System.out.print("Date of Birth (MM/DD/YYYY): ");
            dateOfBirth = keyIn.readLine();
 
            Details enter;
            enter = new Details (firstName, lastName, address, phoneNum, dateOfBirth);
            MainContact.add(enter);
            top++;
            try {
            	enter.write();
            } catch (Exception e) {
            }
        
	}

}
