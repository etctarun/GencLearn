import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeUtility {

  public Employee[] getEmployeeDetails(String[] details) {
    //Fill your code here
    Object[] employees = Arrays
      .stream(details)
      .map(
        detail -> {
          String[] data = detail.split(";");
          Employee employee = new Employee();
          employee.setEmpId(data[0]);
          employee.setEmpName(data[1]);
          employee.setSalary(Double.parseDouble(data[2]));
          return employee;
        }
      )
      .toArray();

    return Arrays.copyOf(employees, employees.length, Employee[].class);
  }

  public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {
    //Fill your code here
    return Arrays.stream(empDetails);
  }

  public String[] shortlistedEmployee(
    Stream<Employee> empStream,
    double minSalary
  ) {
    //Fill your code here
    String[] employees = empStream
      .filter(emp -> emp.getSalary() >= minSalary)
      .sorted((e1, e2) -> e1.getEmpId().compareTo(e2.getEmpId()))
      .map(
        employee ->
          String.format(
            "%s %s %.1f",
            employee.getEmpId(),
            employee.getEmpName(),
            employee.getSalary()
          )
      )
      .toArray(String[]::new);
    return employees;
    //return Arrays.copyOf(employees , employees.length , String[].class);
  }
}
