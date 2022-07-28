package FileWriter;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author shkstart
 * @create 2022-07-08-20:21
 */
public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        File file=new File("IOStream\\hello.txt");//相较于当前工程
           FileReader ff=new FileReader(file);
        int data=ff.read();
              while (data!=-1){
                  System.out.println((char)data);
                  data=ff.read();
              }
    }
          //将IOStream下的hello。txt文件内容读入到程序中，斌输出到控制台

    @Test
    public  void testFileReader() {
        FileReader fr= null;
        try {
            //1.实例化File类的对象，指明要操作的文件
            File file=new File("Hello.txt");//相较于当前module

            //提供具体流
            fr = new FileReader(file);
            //数据的读入
            //read（）；返回读入的一个字符，如果达到文件末尾，返回-1
            int data = fr.read();
            while (data!=-1){
                System.out.println((char)data);
                data=fr.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
