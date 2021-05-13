package com.java8;


import java.util.*;
import java.util.function.Consumer;


public class ForEachExample {
    public static void main(String[] args) {
        List<Person> person = Arrays.asList(new Person("Namrata","Panigrahi",262),
                new Person("Jyoti","Sahoo",35),
                new Person("Deepak","Das",28));
//external iterator
        System.out.println("//Iterate list with for loop");
    for(int i=0;i<person.size();i++) {
        System.out.println(person.get(i));
    }
        System.out.println("/for in loop");

        for(Person p:person){
            System.out.println(p);
        }
        System.out.println("//for each loop lamda expression");
        //internal iteration
       // person.forEach(person1 -> System.out.println((person1)));
        person.forEach(System.out::println);



    }
}
