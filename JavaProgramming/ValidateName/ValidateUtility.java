import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUtility {

  public static void main(String args[]) {
    //fill code here
    Scanner sc = new Scanner(System.in);
    String eName = sc.nextLine();
    String pName = sc.nextLine();

    Validate eValidation = ValidateUtility.validateEmployeeName();
    Validate pValidation = ValidateUtility.validateProductName();

    if (eValidation.validateName(eName)) {
      System.out.println("Employee name is valid");
    } else {
      System.out.println("Employee name is invalid");
    }
    if (pValidation.validateName(pName)) {
      System.out.println("Product name is valid");
    } else {
      System.out.println("Product name is invalid");
    }
  }

  public static Validate validateEmployeeName() {
    //fill code here
    Validate res = name -> {
      Pattern pattern = Pattern.compile("^[a-zA-z\\s]{5,20}$");
      Matcher matcher = pattern.matcher(name);
      return matcher.matches();
    };
    return res;
  }

  public static Validate validateProductName() {
    //fill code here
    Validate res = name -> {
      Pattern pattern = Pattern.compile("^[A-Za-z]\\d{5}$");
      Matcher matcher = pattern.matcher(name);
      return matcher.matches();
    };
    return res;
  }
}
