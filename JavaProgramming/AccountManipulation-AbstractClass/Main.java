public class Main{
    
    public static void main(String args[]){
        Customer cust = new Customer(101, "Tarun", "tb@email.com");
        SavingsAccount savingsAccount = new SavingsAccount(1001, cust, 10000, 500);

        if (savingsAccount.withdraw(9000)) {
            System.out.println(savingsAccount.getBalance());
        }
    }
}