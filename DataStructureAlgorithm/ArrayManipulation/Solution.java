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
   * Complete the 'arrayManipulation' function below.
   *
   * The function is expected to return a LONG_INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. 2D_INTEGER_ARRAY queries
   */

  public static long getMax(List<Integer> list) {
    long max = Long.MIN_VALUE;
    long sum = 0;
    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i);
      max = Math.max(max, sum);
    }
    return max;
  }

  public static long arrayManipulation(int n, List<List<Integer>> queries) {
    // Write your code here
    List<Integer> list = new ArrayList<>(Collections.nCopies(n + 2, 0));
    long res;

    for (int i = 0; i < queries.size(); i++) {
      int a = queries.get(i).get(0);
      int b = queries.get(i).get(1);
      int k = queries.get(i).get(2);

      list.set(a, list.get(a) + k);
      list.set(b + 1, list.get(b + 1) - k);
    }

    // Brute force
    // for(int i =0 ; i < queries.size() ; i++){
    //     int j = 0;
    //     int a = queries.get(i).get(j);
    //     int b = queries.get(i).get(j+1);
    //     int k = queries.get(i).get(j+2);
    //     for( j = 0 ; j < list.size() ; j++){
    //         if(j>=a-1 && j<=b-1){
    //             list.set(j,list.get(j)+k);
    //         }
    //     }
    // }
    // res = Collections.max(list);
    res = getMax(list);
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

    List<List<Integer>> queries = new ArrayList<>();

    IntStream
      .range(0, m)
      .forEach(
        i -> {
          try {
            queries.add(
              Stream
                .of(
                  bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")
                )
                .map(Integer::parseInt)
                .collect(toList())
            );
          } catch (IOException ex) {
            throw new RuntimeException(ex);
          }
        }
      );

    long result = Result.arrayManipulation(n, queries);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
