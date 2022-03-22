import java.util.Scanner;

public class StudentMain{
    
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int id = sc.nextInt();
        System.out.println("Enter Student's Name:");
        String name = sc.nextLine();
        System.out.println("Enter Student's address:");
        String address = sc.nextLine();
        
        String q= null, college=null;
        do{
            System.out.println("Whether the student is from NIT(Yes/No):");
            q = sc.next();
            if(q.equalsIgnoreCase("No")){
                System.out.println("Enter the college name:");
                college = sc.next();
            }else if(!q.equalsIgnoreCase("yes")|| !q.equalsIgnoreCase("No")){
                System.out.println("Wrong Input");
            }
        }while(!q.equalsIgnoreCase("No") || !q.equalsIgnoreCase("No"));
        
        if(q.equalsIgnoreCase("Yes")){
            Student stu = new Student(id , name , address); 
            System.out.println("Student id:" + stu.getStudentId());
            System.out.println("Student name:" + stu.getStudentName());
            System.out.println("Address:" + stu.getStudentAddress());
            System.out.println("College name:" + stu.getCollegeName());
        }else{
            Student stu = new Student(id , name , address , college); 
            System.out.println("Student id:" + stu.getStudentId());
            System.out.println("Student name:" + stu.getStudentName());
            System.out.println("Address:" + stu.getStudentAddress());
            System.out.println("College name:" + stu.getCollegeName());
        }
        
        
    }
}