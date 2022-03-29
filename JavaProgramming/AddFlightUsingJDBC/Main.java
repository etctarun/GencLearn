import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    FlightManagementSystem fms = new FlightManagementSystem();
    if (fms.addFlight(new Flight(1001, "GHZ", "BOM", 120, 2000))) {
      System.out.println("FLight details added successfully");
    } else {
      System.out.println("Addition not done");
    }
  }
}
