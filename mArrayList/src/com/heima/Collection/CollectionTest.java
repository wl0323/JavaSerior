package com.heima.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author shkstart
 * @create 2022-07-06-13:13
 */
public class CollectionTest {
    public static void main(String[] args) {
       Collection<Integer> c=new ArrayList<>();
        c.add(1);
        c.add(4);
        c.add(3);
        System.out.println(c);
        c.clear(); //清除元素
        System.out.println(c);
        System.out.println(c.add(2));
        System.out.println(c.remove(2));//false
        System.out.println(c.contains(3)); //true 判断集合中是否存在指定元素元素
        c.clear();
        System.out.println(!c.isEmpty());
        System.out.println(c.size());
    }
}
