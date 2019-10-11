
public class Details extends Contact{
	
	private String dateOfBirth;

	public Details(String firstName, String lastName, String address, String phoneNum, String dateOfBirth) {
		super(firstName, lastName, address, phoneNum);
		this.dateOfBirth = dateOfBirth;
		// TODO Auto-generated constructor stub
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public void write() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public void viewContact() {
		super.viewContact();
		System.out.println(this.dateOfBirth);
		}

	
}
