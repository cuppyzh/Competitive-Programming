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
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
    // The solution is not neat .-,
        List<Integer> sortedA = a.stream().sorted().collect(Collectors.toList());
        
        int currentCharacter = sortedA.get(0);
        int currentCounter = 1;
        
        int previousCharacter = sortedA.get(0);
        int previousCounter = 1;
        
        int maxPair = 1;
        
        for(int i=1; i<sortedA.size(); i++){
            if (currentCharacter == sortedA.get(i)){
                currentCounter++;
            } else if (sortedA.get(i) - currentCharacter == 1){
                if (maxPair < currentCounter + previousCounter){
                    maxPair = currentCounter + previousCounter;
                }
                
                previousCharacter = currentCharacter;
                previousCounter = currentCounter;
                
                currentCharacter = sortedA.get(i);
                currentCounter = 1;
            } else {
                if (maxPair < currentCounter + previousCounter){
                    maxPair = currentCounter + previousCounter;
                }
                
                currentCharacter = sortedA.get(i);
                currentCounter = 1;
                
                previousCharacter = currentCharacter;
                previousCounter = 0;
            }
        }
        
        System.out.println(previousCharacter);
        System.out.println(previousCounter);
        System.out.println(currentCharacter);
        System.out.println(currentCounter);
        
        if (currentCharacter == previousCharacter && currentCounter > maxPair){
            return currentCounter;
        }
        
        return maxPair;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
