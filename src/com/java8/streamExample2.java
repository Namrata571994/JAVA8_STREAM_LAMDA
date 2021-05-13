package com.java8;

import java.util.*;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

class streamExample2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Namrata", "Panigrahi", 26),
                new Person("Jyoti", "Sahoo", 35),
                new Person("Namita", "Das", 28),
                new Person("Jyamini", "Sss", 20)
        );

        /*people.stream()
                .filter(p->p.getFname().startsWith("J"))
                .forEach(p-> System.out.println(p.getLname()));*/

        Predicate<Person> n = p -> p.getFname().startsWith("N");
        long Count = people.parallelStream()
                .filter(n).count();
        //forEach(p-> System.out.println(p.getLname()))

        System.out.println(Count);
    }


}
