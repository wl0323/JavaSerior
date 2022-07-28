package com.heima.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * @author shkstart
 * @create 2022-07-06-21:16
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("i", "j");
        map.put("m", "n");
        map.put("a", "b");
//        for (Map.Entry<String,String> entry: map.entrySet()){
//            String mapkey=entry.getKey();
//            String mapvlues=entry.getValue();
//            System.out.println(mapkey+":"+mapvlues);
//        }
//        for(String i: map.keySet()){
//            String mapValues=map.get(i);
//            System.out.println(i+":"+mapValues);

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String,String> i:entries){
            String key = i.getKey();
            String value = i.getValue();
            System.out.println(key+":"+value);
        }
//        }
    }
}
