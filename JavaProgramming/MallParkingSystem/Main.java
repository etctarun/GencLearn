import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //Fill the Code
    Scanner sc = new Scanner(System.in);

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    System.out.println("In-time");
    String inTimeStr = sc.nextLine();
    LocalDateTime inTime = null;

    try {
      inTime = LocalDateTime.parse(inTimeStr, dtf);
    } catch (Exception err) {
      System.out.println(inTimeStr + " is an Invalid In-Time");
      System.exit(1);
    }

    String currTime = "29/10/2019 20:10";
    LocalDateTime curr = LocalDateTime.parse(currTime, dtf);

    if (inTime.compareTo(curr) >= 0) {
      System.out.println(inTimeStr + " is an Invalid In-Time");
      System.exit(1);
    }

    System.out.println("Out-time");
    String outTimeStr = sc.nextLine();
    LocalDateTime outTime = null;
    try {
      outTime = LocalDateTime.parse(outTimeStr, dtf);
    } catch (Exception err) {
      System.out.println(outTimeStr + " is an Invalid Out-Time");
      System.exit(1);
    }

    if (inTime.compareTo(outTime) >= 0) {
      System.out.println(outTimeStr + " is an Invalid Out-Time");
      System.exit(1);
    }

    long hours = inTime.until(outTime, ChronoUnit.HOURS);
    long fee = hours * 10 + 10L;
    System.out.println(fee + " Rupees");
  }
}
