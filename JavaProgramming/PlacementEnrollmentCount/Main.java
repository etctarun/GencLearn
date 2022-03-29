import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Fill your code here
    System.out.println("Enter all roll numbers separated by comma");
    String rollNumbers = sc.nextLine();
    Stream<String> rollNumberStream = getRollNumbers(rollNumbers);

    System.out.println("Enter the department name acronym");
    String deptName = sc.nextLine();
    int count = getCount(rollNumberStream, deptName);

    if (count > 0) {
      System.out.println("Number of students in " + deptName + " is " + count);
    } else {
      System.out.println("No students from " + deptName);
    }
  }

  public static Stream<String> getRollNumbers(String rollNumbers) {
    //Fill your code here
    String[] arr = rollNumbers.split(",");
    return Arrays.stream(arr);
  }

  public static int getCount(Stream<String> rollNumberStream, String dept) {
    //Fill your code here
    return (int) rollNumberStream
      .filter(rollNumber -> rollNumber.substring(0, 2).equalsIgnoreCase(dept))
      .count();
  }
}
