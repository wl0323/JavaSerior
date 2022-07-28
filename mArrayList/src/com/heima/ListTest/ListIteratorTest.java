package com.heima.ListTest;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author shkstart
 * @create 2022-07-06-15:01
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("hello");
        list.add("word");
        list.add("java");
        ListIterator<String> lit= list.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.next());
        }
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }
        for(String s:list){
           if(s.equals("word")){
               list.add("王炼");
           }
            System.out.println(s);
        }

    }
}
