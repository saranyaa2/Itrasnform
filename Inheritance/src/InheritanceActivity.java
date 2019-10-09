
public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager man = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		man.calculateSalary();
		man.calculateTransportAllowance();
		
		Trainee train = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		train.calculateSalary();
		train.calculateTransportAllowance();
	}

}
