import java.util.*;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    Scanner sc = new Scanner(System.in);

    //fill the code
    System.out.println("Enter the number of employees");
    int num = Integer.parseInt(sc.nextLine());
    System.out.println("Enter the employee details");

    List<Employee> employeeList = new ArrayList<>();

    for (int i = 0; i < num; i++) {
      String[] data = sc.next().split(":");
      Employee employee = new Employee(
        data[0],
        data[1],
        Double.parseDouble(data[2])
      );
      employeeList.add(employee);
    }
    System.out.println("Enter the number of times salary limit to be searched");
    num = sc.nextInt();

    Management[] managements = new Management[num];

    for (int i = 0; i < num; ++i) {
      System.out.println("Enter the salary limit to be searched");
      double salaryLimit = sc.nextDouble();

      managements[i] = new Management(salaryLimit, employeeList);
      managements[i].start();
      managements[i].join();
    }
    for (Management management : managements) {
      double salaryLimit = management.getSalaryLimit();
      int count = management.getCount();
      System.out.println(String.format("%.1f : %d", salaryLimit, count));
    }
  }
}
