import java.util.Scanner;

public class Main{
    
    public static Candidate getCandidateDetails() throws InvalidSalaryException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the candidate details");
        System.out.println("Name");
        String name = sc.next();
        System.out.println("Gender");
        String gender = sc.next();
        System.out.println("Expected Salary");
        double salary = sc.nextDouble();
        
        if(salary < 10000){
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
        }
        
        Candidate cust = new Candidate();
        cust.setName(name);
        cust.setGender(gender);
        cust.setExpectedSalary(salary);
        
        return cust;
    }
    
    public static void main (String[] args) {
        
    }
}
    