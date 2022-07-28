package com.heima.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author shkstart
 * @create 2022-07-06-13:31
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.add("wl");
        c.add("wtt");
        c.add("hzj");
        Iterator<String> iterator=c.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
