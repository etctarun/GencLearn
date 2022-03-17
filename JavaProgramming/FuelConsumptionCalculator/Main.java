import java.util.Scanner;
class Main{
    private static void test(double value) {
        if (value <= 0) {
            System.out.println((int) value + " is an Invalid Input");
            System.exit(0);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double  costEU, costUS,lit , dis;
        System.out.println("Enter the no of liters to fill the tank");
        lit = sc.nextDouble();
        test(lit);
        System.out.println("Enter the distance covered");
        dis = sc.nextDouble();
        test(dis);

        costEU = ((dis*0.6214)/(lit*0.2642));
        costUS = (lit/dis)*100;
        System.out.println("Liters/100KM");
        System.out.printf("%.2f",costUS);
        System.out.println("");
        System.out.println("Miles/gallons");
        System.out.printf("%.2f",costEU);
 
    }
}