import java.util.Scanner;
public class Main{
    
    public static Hosteller getHostellerDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        int id = sc.nextInt();
        System.out.println("Student Name");
        String name = sc.next();
        System.out.println("Department Id");
        int depId = sc.nextInt();
        System.out.println("Gender");
        String gender = sc.next();
        System.out.println("Phone Number");
        String phone = sc.next();
        
        System.out.println("Hostel Name");
        String hostel = sc.next();
        System.out.println("Room Number");
        int room = sc.nextInt();
        
        System.out.println("Modify Room Number(Y/N");
        char ch = sc.next().charAt(0);
        if(ch == 'Y'){
            System.out.println("New Room Number");
            room = sc.nextInt();
        }
        System.out.println("Modify Phone Number");
        char ch1 = sc.next().charAt(0);
        if(ch1 == 'N'){
            System.out.println("New Phone Number");
            phone = sc.next();
        }
        
        Hosteller stu = new Hosteller();
        stu.setStudentId(id);
        stu.setName(name);
        stu.setDepartmentId(depId);
        stu.setGender(gender);
        stu.setPhone(phone);
        stu.setHostelName(hostel);
        stu.setRoomNumber(room);
        
        return stu;
    } 
    
    public static void main(String[] args){
        System.out.println("The Student Details");
        System.out.println(Main.getHostellerDetails());
        
    }
}