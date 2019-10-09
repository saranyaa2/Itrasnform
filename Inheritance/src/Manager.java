
public class Manager extends Employee {

	
	
	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
		// TODO Auto-generated constructor stub
		
	}

	public void calculateTransportAllowance () {
		double transportAllowance = 15*basicSalary /100;
		System.out.println(transportAllowance);
	}

}
