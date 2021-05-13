package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class LambdaPracticejava8 {

    public static void main(String[] args) {
        List<Person> p= Arrays.asList(new Person("Namita","Das",28),
                new Person("Namrata","Panigrahi",26),
                new Person("Jyoti","Sahoo",35));

        //1. Sort persons by last name
        Collections.sort(p,(o1,o2)->o2.getLname().compareTo(o1.getLname()));
        printconditionally(p,p1->true);
        printconditionally(p,p1->p1.getLname().startsWith("S"));
        printconditionally(p,p1->p1.getLname().startsWith("P"));
    }

    //3.Print person names starts with N
    private static void printconditionally(List<Person> p , Predicate<Person> conditionally) {
        for (Person people:p){
            if(conditionally.test(people)){
                System.out.println(people);
            }
        }
    }
//
//    interface Conditiontionally{
//        boolean test(Person p);
//    }
}
