import java.io.IOException;
// import java.util.*;
public class General {
    public static void main(String[] args) throws IOException{
        System.out.println("enter your age");
        int num= Myclass.sc.nextInt();
        System.out.println("your age is "+num+" have a good day");
        
        System.out.println("Enter your name");
        String name= Myclass.br.readLine();
        System.out.println("your name is "+name+" have a nice day");

        
    }
}
