import java.io.*;
import java.util.*;
public class FileTest {
    public static void main(String[] args) throws IOException {
    
        //creating a file:

        File myfile=new File("adi.txt");
        myfile.createNewFile();
        
        FileWriter writfile=new FileWriter("adi.txt");
        writfile.write("hi i am aditya\nadi hum m bro");
        writfile.close();

        //reading a file
        // FileReader reading=new FileReader("adi.txt");
        File readi = new File("adi.txt");
        Scanner sc = new Scanner(readi);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();

    }

}
