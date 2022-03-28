package com.company.oop;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class stream {

    static String conVal(String s){
        s = s.concat(" mota");
        return s;
    }


    static int conKey(int num){
        return num*num;
    }

    public static void main(String[] args) {
        List<String> number = Arrays.asList("umang","pruthvi","smit","paedant");

        List<String> s1 = number.stream().map(x -> x.concat(" Motadata ")).filter(x -> x.startsWith("p")).sorted().toList();
        Set s2 = number.stream().filter(x-> x.startsWith("u")).map(x-> x.concat("Motadata")).collect(Collectors.toUnmodifiableSet());
        Map m = number.stream().collect(Collectors.toMap(e->e,y->y.concat(" motadata")));
        System.out.println(s1);
        System.out.println(s2);
//        s2.add("aadarsh");
        System.out.println(m);

        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Rugby");
        hashMap.put(2,"Cricket");
        hashMap.put(3,"Basketball");
        hashMap.put(4,"Football");

        System.out.println(hashMap);

    }
}
