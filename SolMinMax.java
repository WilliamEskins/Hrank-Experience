import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    // public static void main(String[] args){
    //     ArrayList<Integer> ints = new ArrayList<Integer>();
    //     Scanner in = new Scanner(System.in);
    //     while(in.hasNext()){
    //         int tempInt = parseInt(in.nextLine());
    //         ints.add(tempInt);
    //     }
        
    // }

    public static void miniMaxSum(List<Integer> arr) {
        int[] list = new int[5];
        long sum = 0;
        long min=0;
        long max=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(j!=i){
                    sum = sum+(arr.get(j));
                    
                }
            }
            if(i==0){
                min=sum;
                max=sum;
            }
            else{
                if(sum>=max){
                    max=sum;
                }
                else if(sum<=min){
                    min=sum;
                }
            }
            sum = 0;
        }
        System.out.println(min+" "+max);

    }

}

public class SolMinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
