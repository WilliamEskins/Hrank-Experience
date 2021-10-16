import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().toLowerCase();
        System.out.println(pangrams(line));
    }
    

    public static String pangrams(String s) {
    // Write your code here
        
        boolean found = true;
        String line = s.toLowerCase();
        
        for (int i=98; i<121;i++){
            char ch = (char) i;
            if(line.indexOf(ch)==-1){
                found = false;
                break;
            }
        }
        
        if(found == true){
            return "pangram";
        }
        else if(found == false){
            return "not pangram";
        }
        else{
            return "not sure";
        }


    }
}

public class Pangram {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
