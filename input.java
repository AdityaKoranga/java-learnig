import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.*;
public class input {
    public static void main(String[] args) throws IOException  {
        // System.out.println("enter your age");
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        // String name= br.readLine();
    // int age=br.readLine();
        System.out.println("enter your age");
        int num= Integer.parseInt(br.readLine());
        if (num >= 18){
            System.out.println("yes you can vote");
        }
        else{
            System.out.println("you cannot vote");
        }

        System.out.println("enterr your name ");
        String name= br.readLine();
        System.out.println("your name is " +name+ "have a good day");
    }
}
