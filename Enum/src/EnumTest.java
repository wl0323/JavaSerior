/**
 * 使用eunm关键字
 * @author shkstart
 * @create 2022-06-27-11:39
 */
public class EnumTest {
    public static void main(String[] args) {
        Season1 spring =Season1.SPRING;
        System.out.println(spring);


        Season1[] k=Season1.values();
        for (int i = 0; i <k.length ; i++) {
            System.out.println(k[i]);
        }

        Thread.State[] i=Thread.State.values();
        for (int j = 0; j <i.length ; j++) {
            System.out.println(i[j]);
        }


        System.out.println(Season1.class.getSuperclass());
    }
}
interface info{
    void show();
}
enum Season1 implements info{
   //1.提供当前枚举类的对象，多个对象之间用“，”分开，末尾对象用“，”；
    SPRING("春天","春暖花开"){
       @Override
       public void show() {

       }
   },
    SUNMER("夏天","春暖花开"){
        @Override
        public void show() {

        }
    },
   ATUUMN("秋天","春暖花开"){
       @Override
       public void show() {

       }
   },
   WINTER("冬天","春暖花开"){
       @Override
       public void show() {

       }
   };

    //1.声明私有类的对象的属性，声明为private final
    private final String seasonName;
    private  final String seasonDsce;
    //2,私有化类的构造器，并给对象属性赋值

    private Season1(String seasonName,String seasonDsce){
        this.seasonDsce=seasonDsce;
        this.seasonName=seasonName;
    }
    
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDsce() {
        return seasonDsce;
    }

//    @Override
//    public String toString() {
//        return "Season1{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDsce='" + seasonDsce + '\'' +
//                '}';
//    }
}
