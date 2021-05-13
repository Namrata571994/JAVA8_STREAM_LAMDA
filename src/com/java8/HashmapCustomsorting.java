package com.java8;

import java.util.*;
import java.util.function.BiConsumer;

public class HashmapCustomsorting {
    public static void main(String[] args) {

        Map<StudentPojo, Integer> map = new TreeMap<>((o1, o2) -> o1.getAge()-o2.getAge());


        map.put(new StudentPojo(26, "Namrata", "Panigrahi"),0000);
        map.put( new StudentPojo(35, "Jyoti", "Sahoo"),2222);
        map.put( new StudentPojo(23, "Sibu", "Panigrahi"),0000);
        map.put( new StudentPojo(26, "Bani", "Mishra"),4444);


        map.entrySet().stream().forEach(System.out::println);
        /*map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(StudentPojo::getFname).reversed()))
                .forEach(System.out::println);*/
    }
    }


     /*List<Map.Entry<Integer,StudentPojo>> list=new ArrayList<>(map.entrySet());
    Collections.sort(list, new Comparator<Map.Entry<Integer, StudentPojo>>() {
        @Override
        public int compare(Map.Entry<Integer, StudentPojo> o1, Map.Entry<Integer, StudentPojo> o2) {
            return o1.getKey().compareTo(o2.getKey());
        }
    });
     for (Map.Entry<Integer,StudentPojo> entry:list){
         System.out.println(entry.getKey()+" \t "+entry.getValue());*/






