package com.java8;


import java.util.*;

public class LambdaExercise1 {
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
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLname().compareTo(o2.getLname());
            }
        });

        //2. Print all persons
        Printallpersons(people);

        PrintConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFname().startsWith("N");
            }
        });

        PrintConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFname().startsWith("J");
            }
        });
    }




    private static void Printallpersons (List<Person> people) {
            for (Person p : people) {
                System.out.println(p);

            }
        }
    //3.Print person names starts with N
    private static void PrintConditionally(List<Person> people,Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }

    }

    interface Condition{
        boolean test(Person p);
    }


    }
