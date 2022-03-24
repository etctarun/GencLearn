public class SavingsAccount extends Account {
    
    private double minimumBalance;
    
    public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	public SavingsAccount(int accountNumber , Customer customerObj , double balance , double minimumBalance){
	    super(accountNumber , customerObj , balance);
	    this.minimumBalance = minimumBalance;
	}
	
	public boolean withdraw(double amount){
	    if(this.getBalance()-amount > this.getMinimumBalance()){
	        double a = this.getBalance() - amount;
	        this.setBalance(a);
	        return true;
	    }
	    return false;
	}
 
}
