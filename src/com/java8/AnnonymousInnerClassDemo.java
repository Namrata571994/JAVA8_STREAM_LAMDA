package com.java8;
interface Age{
    int x= 26;
    void getAge();
}

public class AnnonymousInnerClassDemo {
    public static void main(String[] args) {
        Age a1 = new Age() {
            @Override
            public void getAge() {
                System.out.println("Age is :" + x);
            }
        };
        a1.getAge();

    }
}
