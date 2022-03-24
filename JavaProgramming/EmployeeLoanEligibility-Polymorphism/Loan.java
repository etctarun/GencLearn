public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
		double loan;
		if(employeeObj instanceof PermanentEmployee){
		    loan = employeeObj.getSalary() *0.15;
		}else if(employeeObj instanceof TemporaryEmployee){
		    loan = employeeObj.getSalary() *0.10;
		}
		return loan;
	}

}
