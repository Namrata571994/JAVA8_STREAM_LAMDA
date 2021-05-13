package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(new Person("Namrata", "Panigrahi", 26),
                new Person("Jyoti", "Sahoo", 35),
                new Person("Namita", "Das", 28),
                new Person("Jyamini", "Sss", 20)
        );

        people.stream()
                .filter(p->p.getFname().startsWith("J"))
                .forEach(person -> System.out.println(person.getLname()));



        for (Person p : people) {
            if (p.getFname().startsWith("J")) {
                System.out.println(p.getLname());
            }
        }
    }
}
