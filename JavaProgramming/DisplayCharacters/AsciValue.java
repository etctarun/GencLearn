import java.util.Scanner;
class AsciValue{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[4];
        System.out.println("Enter the digits:");
        for(int i=0; i<4;i++)
            nums[i] = sc.nextInt();
        
        for(int i = 0 ; i<4;i++)
            System.out.println(nums[i]+"-"+(char)nums[i]);

    }
}