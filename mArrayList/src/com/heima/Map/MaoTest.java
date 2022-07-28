package com.heima.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * @create 2022-07-06-16:05
 */
public class MaoTest {
    public static void main(String[] args) {
            Map<String,Integer> map=new HashMap<>();

            map.put("wl",23);
        map.put("zjt",23);
        map.put("zza",23);
        System.out.println(map);
        map.remove("zjt");
//        System.out.println(map);
//        System.out.println(map.containsKey("zza"));
//        System.out.println(map.containsValue(24));

        System.out.println(map.get("zza")); //根据键获取值
        System.out.println(map.keySet());//获取所有的健的集合、
        System.out.println(map.values());//获取所以值的集合

    }
}
