package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Read {
    public static void main(String[] args) {
        try {
            FileInputStream stream = new FileInputStream(  "src/streams/numbers.txt");

            int numar;
            while((numar = stream.read()) != -1) {
                System.out.println(numar);
            }
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
