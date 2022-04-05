import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

class Result {

  /*
   * Complete the 'getTotalX' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY a
   *  2. INTEGER_ARRAY b
   */
  // GCD function
  public static int getGcd(int a, int b) {
    if (b == 0) return a;
    return getGcd(b, a % b);
  }

  // LCM function
  public static int getLcm(int a, int b) {
    if (a == 0 || b == 0) return 0;
    return Math.abs(a * b) / getGcd(a, b);
  }

  public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    int res = 0;

    // calculating lcm of all the elements in the List a;
    int lcm = a.get(0);
    for (int e : a) {
      lcm = getLcm(lcm, e);
    }

    // calculating GCD of all the elements in the List b;
    int gcd = b.get(0);
    for (int e : b) {
      gcd = getGcd(gcd, e);
    }

    // to find all the numbers that are (multiples of List a && factor of all in List b);
    // we have to count the multiples of lcm that divide the gcd;
    int multiple = 0;
    while (multiple <= gcd) {
      multiple += lcm;
      if (gcd % multiple == 0) res++;
    }
    return res;
  }
}

public class Solution {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(
      new InputStreamReader(System.in)
    );
    BufferedWriter bufferedWriter = new BufferedWriter(
      new FileWriter(System.getenv("OUTPUT_PATH"))
    );

    String[] firstMultipleInput = bufferedReader
      .readLine()
      .replaceAll("\\s+$", "")
      .split(" ");

    int n = Integer.parseInt(firstMultipleInput[0]);

    int m = Integer.parseInt(firstMultipleInput[1]);

    List<Integer> arr = Stream
      .of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
      .map(Integer::parseInt)
      .collect(toList());

    List<Integer> brr = Stream
      .of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
      .map(Integer::parseInt)
      .collect(toList());

    int total = Result.getTotalX(arr, brr);

    bufferedWriter.write(String.valueOf(total));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
