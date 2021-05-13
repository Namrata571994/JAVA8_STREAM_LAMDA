package com.java8;
//AnnonymusInnerclass defines inside a constuctor/method as an argument
public class AnnonymusInnerclassdemo2 {
    public static void main(String[] args) {
//        Thread t=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Inside Child Thread");
//            }
//        });
//        t.start();
//        System.out.println("Inside Main Thread");
//
//        }
        // Annonymusinner class implements interface
        Runnable R = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside child thread");
            }
        };
        Thread t = new Thread(R);
        t.start();
        System.out.println("Inside main thread");

    }
}
//Annonymusinnerclass extends a class


