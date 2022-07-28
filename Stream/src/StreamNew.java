import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @author shkstart
 * @create 2022-06-30-20:28
 */
public class StreamNew {
    public static void main(String[] args) {
        //************Colllection集合获取流***********
        Collection<String> list=new ArrayList<>();
        Stream<String> s=list.stream();


        //数组获取stream
        String[] s1={"wl","kl","kk"};
        Stream<String> nameStream= Arrays.stream(s1);

        Stream<String> nameStream1=Stream.of((s1));
    }
}
