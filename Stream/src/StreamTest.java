import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author shkstart
 * @create 2022-07-07-15:44
 */
public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("范丞丞");
        arrayList.add("张继涛");
        arrayList.add("曾子澳");
        arrayList.add("刘凡");
        arrayList.add("梅舜钦");
        arrayList.add("袁星");
        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("范冰冰");
        arrayList1.add("杨幂");
        arrayList1.add("赵丽颖");
        arrayList1.add("董卿");
        arrayList1.add("华春莹");
        arrayList1.add("杨颖");
        Stream<String> s1 = arrayList.stream().filter(s -> s.length() == 3).limit(3);
        Stream<String> s2 = arrayList1.stream().filter(s -> s.startsWith("杨")).skip(1);
        Stream<String> concat = Stream.concat(s1, s2);
        concat.map(Acton::new).forEach(p-> System.out.println(p.getName()));
    }
}
class Acton{
    private  String name;

    public Acton(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

