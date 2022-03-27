import java.util.*;

public class PhoneBook {

  private List<Contact> phoneBook = new ArrayList<>();

  public void setPhoneBook(List<Contact> phoneBook) {
    this.phoneBook = phoneBook;
  }

  public List<Contact> getPhoneBook() {
    return this.phoneBook;
  }

  public void addContact(Contact contactObj) {
    this.phoneBook.add(contactObj);
  }

  public List<Contact> viewAllContacts() {
    return this.phoneBook;
  }

  public Contact viewContactGivenPhone(long phoneNumber) {
    for (Contact c : this.phoneBook) {
      if (c.getPhoneNumber() == phoneNumber) {
        return c;
      }
    }
    return null;
  }

  public boolean removeContact(long phoneNumber) {
    for (Contact c : this.phoneBook) {
      if (c.getPhoneNumber() == phoneNumber) {
        phoneBook.remove(c);
        return true;
      }
    }
    return false;
  }
}
