import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class replacing {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("adi.txt");

        FileWriter fw = new FileWriter("output.txt");
        Scanner sc = new Scanner(fr);
        while(sc.hasNextLine()){
            String data = sc.nextLine();
            fw.write(data.replaceAll("[aeiouAEIOU]", " "));

        }
        fr.close();
        fw.close();
        sc.close();
    }
}
