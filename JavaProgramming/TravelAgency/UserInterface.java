import java.util.Scanner;

public class UserInterface {

  public static CommissionInfo generateCommissionObtained() {
    CommissionInfo obj = ticketObj ->
      ticketObj.getClassType().toUpperCase().matches("^(SL|2S)$")
        ? 60
        : ticketObj.getClassType().toUpperCase().matches("^(1A|2A|3A)$")
          ? 100
          : 0;
    return obj;
  }

  public static void main(String args[]) {
    // Fill the code here
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the no of passengers");
    int n = Integer.parseInt(sc.nextLine());

    Ticket[] tickets = new Ticket[n];
    double totalCommission = 0.0;

    for (int i = 0; i < n; i++) {
      System.out.println(String.format("Details of Passenger %d:", (i + 1)));
      System.out.println("Enter the pnr no:");
      long pnrNo = Long.parseLong(sc.nextLine());
      System.out.println("Enter passenger name:");
      String name = sc.nextLine();
      System.out.println("Enter seat no:");
      int seatNo = Integer.parseInt(sc.nextLine());
      System.out.println("Enter class type:");
      String classType = sc.nextLine();
      System.out.println("Enter ticket fare:");
      double fare = Double.parseDouble(sc.nextLine());

      tickets[i] = new Ticket(pnrNo, name, seatNo, classType, fare);
      CommissionInfo cInfo = generateCommissionObtained();
      totalCommission += cInfo.calculateCommissionAmount(tickets[i]);
    }

    System.out.println("Commission Obtained");
    System.out.println(
      String.format(
        "Commission obtained per each person: Rs.%.2f",
        totalCommission
      )
    );
  }
}
