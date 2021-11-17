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

public class IntegerArrayPairs{

    /*
     * The function is expected to return an INTEGER # of Pairs
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */
     
    public static main(String[] args){
      int test1Exp = 4;
      int test1;
      List<Integer> testList = new ArrayList<>();
      Collections.addAll(testList, 1,2,10,20,36,25,36,1,2,9,20);
      test1 = sockMerchant(testList.size(),testList);
      System.out.println("First test pairs: " + test1);
      boolean test1Bool = (test1==test1Exp);
      System.out.println("Pass?: " + test1Bool); 
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        int pairsOut = 0;
        int prevInt = -1;
        Map<Integer,Integer> pastCheck = new HashMap<>();
        for(int i=0;i<ar.size();i++){
            if(i==(ar.size()-1)){
                if(pastCheck.containsKey(ar.get(i))){
                    //pastCheck.remove(ar.get(i));
                    pairsOut++;
                }
            }
            else{
                if(ar.get(i)==ar.get(i+1)){
                    pairsOut++;
                    i++;
            }
                else{
                    if(pastCheck.containsKey(ar.get(i))){
                        pastCheck.remove(ar.get(i));
                        pairsOut++;
                    }
                    else{
                        pastCheck.put(ar.get(i),i);
                    }
                }
            }
        }
        return pairsOut;

    }

}
