import java.util.Scanner;
public class Main{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       
       // not required for program , only for local testing
        PermanentEmployee permanentEmployee = new PermanentEmployee(103, "MeenakC", 10000);
        TemporaryEmployee temporaryEmployee = new TemporaryEmployee(105, "Memgha", 7, 100);

        Loan loan = new Loan();
        double permanentEmployeeLoan = loan.calculateLoanAmount(permanentEmployee);
        double temporaryEmployeeLoan = loan.calculateLoanAmount(temporaryEmployee);

        System.out.println(permanentEmployeeLoan);
        System.out.println(temporaryEmployeeLoan);
    }
    
}