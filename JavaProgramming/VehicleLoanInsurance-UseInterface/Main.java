import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //for local testing only
        Vehicle vehicle = new Vehicle("UP16BC", "Jupiter", "2 wheeler", 90000);
        System.out.println(vehicle.issueLoan());
        System.out.println(vehicle.takeInsurance());
    }
}