package com.java8;

import java.util.*;

public class SortingHashmapwithValues {

    public static void main(String[] args) {

        Map<Integer,String> map=new TreeMap<>();
        map.put(7,"Namrata");
        map.put(90,"Bapuji");
        map.put(0,"Bobby");
        map.put(9,"Sibu");

       /* System.out.println("Hashmap before sorting :");
        List<Map.Entry<Integer,String>> list=new ArrayList<>(map.entrySet());

        Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

       *//* for (Map.Entry<Integer,String> entry:list){
            System.out.println(entry.getKey()+ " \t"+entry.getValue());
        }*//*

        list.forEach(System.out::println);   */
        //(entry1->entry1.getKey()+" \t"+entry1.getValue());

       map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("***************");
       map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);



    }

}
