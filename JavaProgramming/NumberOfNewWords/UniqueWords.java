//import the necessary packages if needed

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@SuppressWarnings("unchecked") // Do not delete this line
public class UniqueWords {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student's Article");
    String article = sc.nextLine();

    String[] words = article.split("[,;:.?!\\s]+");

    List<String> totalWords = Arrays
      .stream(words)
      .filter(string -> !string.isEmpty())
      .collect(Collectors.toList());

    List<String> uniqueWords = Arrays
      .stream(words)
      .map(String::toLowerCase)
      .distinct()
      .sorted()
      .collect(Collectors.toList());

    System.out.println("Number of words " + totalWords.size());
    System.out.println("Number of unique words " + uniqueWords.size());
    System.out.println("The words are");

    int order = 1;
    for (String w : uniqueWords) {
      System.out.println(String.format("%d. %s", (order++), w));
    }
  }
}
