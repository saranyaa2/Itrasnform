package ExcHandling;

import java.io.IOException;

public class TaxCalculator {

	private static int taxAmount = 0;
	String empName;
	boolean isIndian;
	int empSal;
	
	public static int calculateTax(String empName, boolean isIndian, int empSal) throws Exception 
	{
		
		
		if(isIndian != true)  
		{
			throw new Exception("CountryNotValidException");  
	    }  
		
		if(empName == null ) 
		{
			throw new Exception("EmployeeNameInvalidException"); 
        }
		if(empSal > 10000 && isIndian == true) {
			 taxAmount = empSal*8/100;
		}
		else if(empSal>50000 && empSal<10000 && isIndian == true) {
			 taxAmount = empSal *6/100;
		}
		else if(empSal>30000 && empSal<50000 && isIndian == true) {
			 taxAmount = empSal *5/100;
		}
		else if(empSal>10000 && empSal<30000 && isIndian == true) {
		     taxAmount = empSal *4/100;
		}
		else {
			throw new Exception("TaxNotEligibleException");
		}
	
		return taxAmount;
		
	}


	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
	    try {
	    	calculateTax("Saran", true, 56500);
	    	System.out.println("Tax amount is :" + taxAmount);
	    	}
	    	catch (Exception e) {
	    		System.out.println("The employee should be an Indian citizen for calculating tax");
	    	}
	    
	    try {
			calculateTax("Mom", false, 62500);
			System.out.println("Tax amount is :" + taxAmount);
		    }
		    catch (Exception e) {
		        System.out.println("The employee should be an Indian citizen for calculating tax");
		     }

	    
	    try {
			calculateTax(null, true, 56500);
			System.out.println("Tax amount is :" + taxAmount);
		    }
		    catch (Exception e) {
		        System.out.println("The employee name cannot be empty");
		     }
	    
	    try {
			calculateTax("Mano", true, 100);
			System.out.println("Tax amount is :" + taxAmount);
		    }
		    catch (Exception e) {
		        System.out.println("The employee does not need to pay tax");
		     }
	}


	public TaxCalculator(String empName, boolean isIndian, int empSal) {
		super();
		this.empName = empName;
		this.isIndian = isIndian;
		this.empSal = empSal;
	}


	public TaxCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
