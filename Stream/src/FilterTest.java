import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author shkstart
 * @create 2022-07-07-15:16
 */
public class FilterTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("王炼");
        list.add("张继涛");
        list.add("张继成");
        list.add("王泽宇");


//        Stream<String> stream = list.stream();
//        stream.filter(s->s.length()>2).forEach(System.out::println);
 //       list.stream().limit(3).forEach(System.out::println);//输出前n个元素
  //      list.stream().skip(2).forEach(System.out::println);//跳过前n个元素，输出剩下的
//        list.stream().skip(1).limit(2).forEach(System.out::println);
        Stream<String> s1 = list.stream().limit(2);
        Stream<String> s2 = list.stream().skip(1);
//          Stream.concat(s1, s2).forEach(System.out::println);

//          Stream.concat(s1,s2).distinct().forEach(System.out::println);



         ArrayList<String> arrayList=new ArrayList<>();
         arrayList.add("wl");
         arrayList.add("zza");
         arrayList.add("wzy");
         arrayList.add("zjt");
//         arrayList.stream().sorted().forEach(System.out::println);
         arrayList.stream().sorted((s,ss)->s.length()-ss.length()).forEach(System.out::println);

        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("20");
        arrayList1.add("21");
        arrayList1.add("19");
        arrayList1.add("30");

        arrayList1.stream().map(s->Integer.parseInt(s)).forEach(System.out::println);
    }
}
