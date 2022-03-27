import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PhoneBook phoneBook = new PhoneBook();

    while (true) {
      System.out.println("Menu");
      System.out.println("1.Add Contact");
      System.out.println("2.Display all contacts");
      System.out.println("3.Search contact by phone");
      System.out.println("4.Remove contact");
      System.out.println("5.Exit");
      System.out.println("Enter your choice:");
      int choice = Integer.parseInt(sc.nextLine());
      switch (choice) {
        case 1:
          System.out.println("Add a Contact:");
          System.out.println("Enter the First Name:");
          String fName = sc.nextLine();
          System.out.println("Enter the Last Name:");
          String lName = sc.nextLine();
          System.out.println("Enter the Phone No.:");
          long phone = Long.parseLong(sc.nextLine());
          System.out.println("Enter the Email:");
          String email = sc.nextLine();
          Contact contact = new Contact(fName, lName, phone, email);
          phoneBook.addContact(contact);
          break;
        case 2:
          System.out.println("The contacts in the List are:");
          for (Contact c : phoneBook.viewAllContacts()) {
            System.out.println("First Name: " + c.getFirstName());
            System.out.println("Last Name: " + c.getLastName());
            System.out.println("Phone No.: " + c.getPhoneNumber());
            System.out.println("Email: " + c.getEmailId());
          }
          break;
        case 3:
          System.out.println("Enter the Phone number to search contact:");
          long ph1 = Long.parseLong(sc.nextLine());
          Contact c = phoneBook.viewContactGivenPhone(ph1);
          System.out.println("The contact is:");
          System.out.println("First Name: " + c.getFirstName());
          System.out.println("First Name: " + c.getFirstName());
          System.out.println("Last Name: " + c.getLastName());
          System.out.println("Phone No.: " + c.getPhoneNumber());
          System.out.println("Email: " + c.getEmailId());
          break;
        case 4:
          System.out.println("Enter the phone number to remove :");
          long ph2 = Long.parseLong(sc.nextLine());
          System.out.println("Do you want to remove the contact (Y/N):");
          char ch = sc.next().charAt(0);
          if (phoneBook.removeContact(ph2)) {
            System.out.println("The contact is successfully deleted.");
          }
          break;
        case 5:
          System.exit(1);
          break;
        default:
          break;
      }
    }
  }
}
