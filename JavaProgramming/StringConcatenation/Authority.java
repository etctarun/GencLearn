import java.util.Scanner;
class Authority{
    
    public static boolean check(String s){
        for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if (Character.isLetter(ch) || ch == ' ') {
          continue;
        }
        System.out.println("Invalid name");
        System.exit(0);
     }
     return true;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name, fname, res;
        System.out.println("Inmate's name:");
        name = sc.nextLine();

        System.out.println("Inmate's father's name:");
        fname = sc.nextLine();
        check(name);
        check(fname);
        res = name.toUpperCase().concat(" ").concat(fname.toUpperCase());
        System.out.println(res);
        
    }
}