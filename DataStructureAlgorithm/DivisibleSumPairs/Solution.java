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
   * Complete the 'divisibleSumPairs' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. INTEGER k
   *  3. INTEGER_ARRAY ar
   */

  public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // Write your code here
    Map<Integer, Integer> map = new HashMap<>();
    int countPairs = 0;

    for (int e : ar) {
      int mod = e % k;

      int com = k - mod == k ? 0 : k - mod; // k-0 = k , hence put com = 0 ;

      // if map contains complementry of k, it means a pair is formed then add its frequency to count
      if (map.containsKey(com)) {
        countPairs += map.get(com);
      }
      // add mod to map with its frequency as value
      if (map.containsKey(mod)) {
        map.put(mod, map.get(mod) + 1);
      } else if (!map.containsKey(mod)) {
        map.put(mod, 1);
      }
    }
    return countPairs;
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

    int k = Integer.parseInt(firstMultipleInput[1]);

    List<Integer> ar = Stream
      .of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
      .map(Integer::parseInt)
      .collect(toList());

    int result = Result.divisibleSumPairs(n, k, ar);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
