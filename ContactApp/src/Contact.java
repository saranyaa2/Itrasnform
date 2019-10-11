
public class Contact {
	
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setContactNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Contact(String firstName, String lastName, String address, String phoneNum) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNum = phoneNum;
	}

		
	public void viewContact() {
		// TODO Auto-generated method stub
		System.out.println(this.getFirstName());
		System.out.println(this.getLastName());
		System.out.println(this.getAddress());
		System.out.println(this.getPhoneNum());
		
		}

	
}
