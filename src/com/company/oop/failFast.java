package com.company.oop;

import java.util.HashMap;
        import java.util.Iterator;
        import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class failFast {
    public static void main(String[] args)
    {
         HashMap<String,String> cityCode = new HashMap<>();
//        ConcurrentHashMap<String, String> cityCode = new ConcurrentHashMap<>();
        cityCode.put("Delhi", "India");
        cityCode.put("Moscow", "Russia");
        cityCode.put("New York", "USA");

        Iterator iterator = cityCode.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(cityCode.get(iterator.next()));


            cityCode.put("Istanbul", "Turkey");
        }
    }
}
