import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(new FileReader("log.txt"));
    StringBuilder stringBuilder = new StringBuilder();

    while (sc.hasNext()) {
      String line = sc.nextLine();
      stringBuilder.append(line);
    }
    System.out.println(stringBuilder.toString());
  }
}
