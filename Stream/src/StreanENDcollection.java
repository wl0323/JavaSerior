import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author shkstart
 * @create 2022-07-07-16:00
 */
public class StreanENDcollection {
    public static void main(String[] args) {
        ArrayList<String> arrayList4=new ArrayList<>();
        arrayList4.add("范丞丞");
        arrayList4.add("张继涛");
        arrayList4.add("曾子澳");
        arrayList4.add("刘凡");

        Stream<String> stringStream = arrayList4.stream().filter(s -> s.length() == 3);
        List<String> collect = stringStream.collect(Collectors.toList());
        for (String i:collect){
            System.out.println(i);
        }

        Set<Integer> set=new HashSet<>();
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(20);
        set.add(23);
        Stream<Integer> integerStream = set.stream().filter(s -> s > 19);
        Set<Integer> collect1 = integerStream.collect(Collectors.toSet());
        for (Integer i:collect1){
            System.out.println(i);
        }

    }
}
