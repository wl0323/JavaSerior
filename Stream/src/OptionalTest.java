import org.testng.annotations.Test;

import java.util.Optional;

/**
 * @author shkstart
 * @create 2022-07-07-21:23
 */
public class OptionalTest {

    public static void main(String[] args) {
        //创建方式 Optional.of(),括号内传入数据，不能传入空
        Optional<String> op1=Optional.of("zhangsan");
     //   Optional<Object> op2 = Optional.of(null); //NullPointerException

        //通过Optional.ofNullable(),支持传入null;
        Optional<String> op3 = Optional.ofNullable("list");
        Optional<Object> op4 = Optional.ofNullable(null);
        //直接通过empty的方式创建一个空Optional对象
        Optional<Object> empty = Optional.empty();


    }
    //常用方法
    @Test
    public  void method(){
        Optional<String> op1=Optional.of("zhangsan");
        Optional<String> empty = Optional.empty();
//        if(op1.isPresent()){
//            String s = op1.get();
//            System.out.println("用户名"+s);
//        }
//        if(empty.isPresent()){
//            System.out.println(empty.get());
//        }else {
//            System.out.println("没有值");
//        }
//        String wl = op1.orElse("wl");
//        System.out.println(wl);
//        String op3 = empty.orElse("张继涛");
//        System.out.println(op3);
//
//        String s1 = op1.orElseGet(()->{
//            return  "hello";
//        });
//        System.out.println(s1);


      op1.ifPresent(s->{
           System.out.println("wanglian");
        });


    }

}
