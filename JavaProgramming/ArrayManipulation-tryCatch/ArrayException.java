import java.util.*;
public class ArrayException{
    
    public String getPriceDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter the price details");
        
        for(int i=0 ; i <x; i++){
            try{
               arr[i] = sc.nextInt();
            }catch(InputMismatchException err){
                return "Input was not in the correct format";
            }
           
        }
        System.out.println("Enter the index of the array element you want to access");

        try{
            int idex = sc.nextInt();
            return "The array element is "+ arr[idex];
        }catch(InputMismatchException err){
            return "Input was not in the correct format";
            
        }catch(ArrayIndexOutOfBoundsException err){
            return "Array index is out of range";
        }
        
    }
    
    public static void main (String[] args) {
        ArrayException obj = new ArrayException();
        System.out.println(obj.getPriceDetails());
    }
}