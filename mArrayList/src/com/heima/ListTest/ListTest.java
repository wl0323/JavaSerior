package com.heima.ListTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author shkstart
 * @create 2022-07-06-14:48
 */
public class ListTest {


    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("hello");
        list.add("word");
        list.add("java");
        list.add("java");
//        System.out.println(list);
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        list.add(2,"javaee");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.set(1,"王炼");//修改指定索引处的值
        System.out.println(list.get(1));
        System.out.println(list);
        for (int i = 0; i <=list.size()-1 ; i++) {
            System.out.println(list.get(i));
        }
    }
}
