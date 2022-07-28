/**
 * @author shkstart
 * @create 2022-06-27-11:14
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season spring=Season.SPRING;
        System.out.println(spring);
    }
}
class Season{
    //1.声明私有类的对象的属性，声明为private final
    private final String seasonName;
    private  final String seasonDsce;
    //2,私有化类的构造器，并给对象属性赋值

    private Season(String seasonName,String seasonDsce){
        this.seasonDsce=seasonDsce;
        this.seasonName=seasonName;
    }
    //提供当前类的多个对象
    public static final Season SPRING=new Season("春天","春暖花开");
    public static final Season SUNMER=new Season("夏天","春暖花开");
    public static final Season ATUUMN=new Season("秋天","春暖花开");
    public static final Season WINTER=new Season("冬天","春暖花开");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDsce() {
        return seasonDsce;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDsce='" + seasonDsce + '\'' +
                '}';
    }
}
