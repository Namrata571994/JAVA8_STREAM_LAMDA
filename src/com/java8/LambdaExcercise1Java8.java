package com.java8;
import com.java8.LambdaExercise1;


import java.util.*;
import java.util.function.Predicate;

class LambdaExercise1Java8 {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(new Person("Namrata", "Panigrahi", 26),
                new Person("Jyoti", "Sahoo", 35),
                new Person("Namita", "Das", 28)
        );
        //TASK
        //1. Sort persons by last name
        //2. With a method Print all persons
        //3.Print person names starts with N

//1. Sort persons by last name
//        Collections.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getLname().compareTo(o2.getLname());
//            }
//        });

        Collections.sort(people,( o1, o2)-> o1.getLname().compareTo(o2.getLname()));

        //2. Print all persons
        PrintConditionally(people,p->true);

//        PrintConditionally(people, new Condition() {
//            @Override
//            public boolean test(Person p) {
//                return p.getFname().startsWith("N");
//            }
//        });


        PrintConditionally(people,p-> p.getFname().startsWith("N"));

//        PrintConditionally(people, new Condition() {
//            @Override
//            public boolean test(Person p) {
//                return p.getFname().startsWith("J");
//            }
//        });

        PrintConditionally(people,p-> p.getFname().startsWith("J"));
    }

//    private static void Printallpersons (List<Person> people) {
//        for (Person p : people) {
//            System.out.println(p);
//
//        }
//    }
    //3.Print person names starts with N
    //Predicate<T> -> Represents a predicate (boolean-valued function) of one argument.
    private static void PrintConditionally(List<Person> people, Predicate<Person> predicate) {
        for (Person p : people) {
            if (predicate.test(p)) {
                System.out.println(p);
            }
        }

    }

   }




