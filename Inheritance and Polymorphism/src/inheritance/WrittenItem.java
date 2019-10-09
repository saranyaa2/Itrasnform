package inheritance;

public class WrittenItem extends Item {

	private String Author;
	
	@Override
	public String toString() {
		return "WrittenItem []";
	}

	public WrittenItem(String author) {
		super();
		Author = author;
	}

	public WrittenItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WrittenItem(int idNum, String title, int noOfCopies) {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
