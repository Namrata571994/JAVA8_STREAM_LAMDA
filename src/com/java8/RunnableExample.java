package com.java8;

public class RunnableExample {

    public static void main(String[] args) {
//        Thread t =new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Inside Runnable Thread");
//            }
//        });
//
//        t.run();

       //Runnable r=()->System.out.println("Inside Runnable Thread");
     Thread thread =new Thread(()->System.out.println("Inside Runnable Thread"));

        thread.run();

//        Runnable r = () -> System.out.println("Inside Lambda Runnable Thread");
//        Thread lambda=new Thread(r);
//        lambda.run();
        System.out.println("Inside Outer Thread");
    }
}
