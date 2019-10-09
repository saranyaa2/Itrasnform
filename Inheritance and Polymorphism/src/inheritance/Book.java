package inheritance;

public class Book extends WrittenItem{

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String str, int n){
		super();
		}
	public boolean equals(Object obj){
		if(obj == null)
		return false;
		Book otherBook = (Book) obj;
		return super.equals(otherBook);
		}

}
