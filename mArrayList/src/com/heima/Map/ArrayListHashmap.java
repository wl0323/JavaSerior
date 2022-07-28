package com.heima.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author shkstart
 * @create 2022-07-07-10:30
 */
public class ArrayListHashmap {
    public static void main(String[] args) {
        ArrayList<HashMap> arrayList=new ArrayList<>();
        HashMap<String,String> m1=new HashMap<>();
        m1.put("孙策","小乔");
        m1.put("周瑜","大乔");
        HashMap<String,String> m2=new HashMap<>();
        m2.put("郭靖","黄蓉");
        m2.put("杨过","小龙女");
       HashMap<String,String> m3=new HashMap<>();
        m3.put("令狐冲","任盈盈");
        m3.put("林平之","岳林珊");
        arrayList.add(m1);
        arrayList.add(m2);
        arrayList.add(m3);

        for (HashMap<String,String> map:arrayList){
            Set<String> set = map.keySet();
            for (String key:set){
                String s = map.get(key);
                System.out.println(key+":"+s);
            }
        }


    }
}
