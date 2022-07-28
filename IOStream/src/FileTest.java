import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author shkstart
 * @create 2022-07-08-19:45
 */
public class FileTest {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream file=new FileInputStream("IOStream\\file.txt");
//        try {
//            int len=file.read();
//            while (len!=-1){
//                System.out.println( len);
//                len=file.read();
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }finally {
//            try {
//                file.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

        byte[] bytes=new byte[1024];
        try {
            int len=file.read(bytes);
            while (len!=-1){
                System.out.println(new String(bytes,0,len));
                len=file.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
