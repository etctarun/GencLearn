public class Account{
    private int accountId;
    private String accountType;
    private int balance;
    
    public Account(){
        
    }
    
    public Account(int id , String type , int bal){
        this.accountId = id;
        this.accountType = type;
        this.balance = bal;
    }
    
    public int getAccountId() {
		return this.accountId;
	}
    public void setAccountId(int input) {
		this.accountId = input;
	}
    public String getAccountType() {
		return this.accountType;
	}
    public void setAccountType(String input) {
		this.accountType = input;
	}
    public int getBalance() {
		return this.balance;
	}
    public void setBalance(int input) {
		this.balance = input;
	}
    
    public boolean withdraw(int m){
        if(m <= this.balance){
            this.balance -= m;
            System.out.println("Balance amount after withdraw: "+ this.balance);
            return true;
        }else{
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
    }
}