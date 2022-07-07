import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        
        /*
            Using brute force, not efficient!
        */
        
        List<Integer> result = new ArrayList<Integer>();
        
        System.out.println("A: " + a.get(a.size()-1));
        System.out.println("B: " + b.get(0));
        
        for (int i = a.get(a.size()-1); i <= b.get(0); i++ ){
            boolean flagA = true;
            boolean flagB = true;
            
            System.out.println("i : " + i);
            
            for (int elementA: a){
                if (i % elementA != 0){
                    System.out.println("Fail on A :" + elementA);
                    flagA = false;
                    break;
                }
            }
            
            if (!flagA){
                continue;
            }
            
            for (int elementB: b){
                if (elementB % i != 0){
                    System.out.println("Fail on A :" + elementB);
                    flagB = false;
                    break;
                }
            }
            
            if (flagB){
                result.add(i);
            }
        }
        
        return result.size();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
