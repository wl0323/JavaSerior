package com.heima.SetTest;

import java.util.HashSet;
import java.util.Set;

/**
 * @author shkstart
 * @create 2022-07-06-20:28
 */
public class SetTestTest {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();//HashSet对集合的迭代顺序不做任何保证
        set.add("wl");
        set.add("leran");
        set.add("java");
        System.out.println(set.add("wl"));
        for(String i:set){
            System.out.println(i);
        }
    }
}
