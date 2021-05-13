package com.java8;

public class Greeter {
//Here  we can passed instance of interface as an argument
    public void greet(GreeetInterface greetlambda){

        greetlambda.perform();
    }
    public static void main(String[] args) {
        Greeter gt=new Greeter();
        //GreeetInterface hw=new Helloworld();
      // GreeetInterface greetlambda=()-> System.out.println("Hello Bangaluru!!!!!");

        /*Helloworld hello=new Helloworld(){

            public void perform(){
                System.out.println("Hello world!!!!!");
            }
        };*/
        //GreeetInterface greeetInterface = () -> System.out.println("Hello Bangaluru!!!!!");
        gt.greet(() -> System.out.println("Hello Bangaluru!!!!!"));


    }


}
