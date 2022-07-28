package inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author shkstart
 * @create 2022-07-08-21:30
 */
public class InputStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream inputStream=new FileInputStream("C:\\Users\\Admin\\Desktop\\hello.txt");
        try {
            int len=inputStream.read();
            while (len!=-1){
                System.out.println((char) len);
                len=inputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
