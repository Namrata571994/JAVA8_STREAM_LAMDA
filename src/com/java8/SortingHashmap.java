package com.java8;

import java.util.*;

public class SortingHashmap {

    public static void main(String[] args) {

        Map<Integer, StudentPojo> map=new HashMap<>();

        map.put( 1111,new StudentPojo(26,"Namrata","Panigrahi"));
        map.put( 2222,new StudentPojo(35,"Jyoti","Sahoo"));
        map.put( 3333,new StudentPojo(23,"Sibu","Panigrahi"));
        map.put( 4444,new StudentPojo(26,"Bani","Mishra"));

       //1. JUST STORE ENTRYSET IN A LIST
        List<Map.Entry<Integer,StudentPojo>> list=new ArrayList<>(map.entrySet());

        /*Collections.sort(list, new Comparator<Map.Entry<Integer, StudentPojo>>() {
            @Override
            public int compare(Map.Entry<Integer, StudentPojo> o1, Map.Entry<Integer, StudentPojo> o2) {
                return o1.getValue().getFname().compareTo(o1.getValue().getFname());
            }
        });*/
        //2. SORT USING COMPARATOR WITH A FIELD
        Collections.sort(list, (o1, o2) -> o1.getValue().getFname().compareTo(o2.getValue().getFname()));
       //3.  JUST ITERATE IT
       System.out.println("hashmap after sort by values");
        list.forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));
       // list.forEach(System.out::println);
            /*for(Map.Entry<Integer,StudentPojo> m:list ){
                System.out.println(m.getKey()+" "+m.getValue());

}*/

    }



}
