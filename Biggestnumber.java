// import java.util.*;

public class Biggestnumber{
    public static void main(String[] args) {
        int b= Integer.parseInt(args[0]);
        int n;
        for(int i=1;i<args.length;i++){
            n=Integer.parseInt(args[i]);
            if(b<n)
                b=n;

        }
        System.out.println("the biggest number is "+b);

    }
}