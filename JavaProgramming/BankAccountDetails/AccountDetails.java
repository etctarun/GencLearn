import java.util.Scanner;
public class AccountDetails{
    
    public Account getAccountDetails(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter account id:");
        int id = sc.nextInt();
        
        System.out.println("Enter account type:");
        String atype = sc.next();
        
        int bal;
        do{
            System.out.println("Enter balance:");
            bal = sc.nextInt();
            if(bal<=0){
                System.out.println("Balance should be positive");
            }
        }while(bal<=0);
        
        Account obj = new Account(id , atype , bal);
        return obj;
    }
    public int getWithdrawAmount(){
        Scanner sc = new Scanner(System.in);
        int a;
        do{
            System.out.println("Enter amount to be withdrawn:");
            a = sc.nextInt();
            if(a<=0){
                System.out.println("Amount should be positive");
            }
        }while(a<=0);
        return a;
    }
    
    public static void main(String[] args){
        AccountDetails obj = new AccountDetails();
        Account acc = obj.getAccountDetails();
        int wAmount = obj.getWithdrawAmount();
        acc.withdraw(wAmount);
    }
}