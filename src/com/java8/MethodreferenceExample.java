package com.java8;

public class MethodreferenceExample {
    public static void main(String[] args) {


       // Thread T=new Thread(() -> printMessage());
       // Thread T=new Thread(MethodreferenceExample::printMessage);

        Thread T=new Thread(new Runnable() {
            @Override
            public void run() {
                printMessage();
            }
        });


        T.start();
       // printMessage();


    }

    public static void printMessage(){
        System.out.println("Hello");

    }
}

