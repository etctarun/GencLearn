import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  private static Map<String, Double> employeeMap;

  public Map<String, Double> getEmployeeMap() {
    return employeeMap;
  }

  public void setEmployeeMap(Map<String, Double> employeeMap) {
    this.employeeMap = employeeMap;
  }

  public void addEmployeeDetails(String employeeName, double salary) {
    // Fill the code
    this.employeeMap.put(employeeName, salary);
  }

  public static EmployeeAudit findEmployee() {
    // Fill the code
    // ArrayList<String> same as EmployeeAudit functional interface
    EmployeeAudit name = salary ->
      new ArrayList<>(
        employeeMap
          .entrySet()
          .stream()
          .filter(ele -> ele.getValue() <= salary)
          .map(Map.Entry::getKey)
          .collect(Collectors.toList())
      );
    return name;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Fill the code
    Main obj = new Main();
    while (true) {
      System.out.println("1.Add Employee Details");
      System.out.println("2.Find Employee Details");
      System.out.println("3.Exit");
      System.out.println("Enter the choice");
      int choice = Integer.parseInt(sc.next());
      switch (choice) {
        case 1:
          System.out.println("Enter the Employee name");
          String name = sc.nextLine();
          System.out.println("Enter the Employee Salary");
          double salary = Double.parseDouble(sc.nextLine());
          obj.addEmployeeDetails(name, salary);
          break;
        case 2:
          System.out.println("Enter the salary to be searched");
          double search = Double.parseDouble(sc.nextLine());
          EmployeeAudit empAudit = findEmployee();
          List<String> employees = empAudit.fetchEmployeeDetails(search);
          if (employees.isEmpty()) {
            System.out.println("No Employee Found");
          } else {
            System.out.println("Employee List");
            for (String emp : employees) {
              System.out.println(emp);
            }
          }
          break;
        case 3:
          System.out.println("Let's complete the session");
          System.exit(1);
        default:
          break;
      }
    }
  }
}
