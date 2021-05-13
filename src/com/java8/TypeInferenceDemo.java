package com.java8;

public class TypeInferenceDemo {
    public static void main(String[] args) {

        StringlengthCount stringlengthCount = s -> s.length();
        printlength(stringlengthCount);
        //StringlengthCount stringlengthCount1 = (String s) -> s.length();

       // StringlengthCount l= stringlengthCount1;
        StringlengthCount l=new StringlengthCount() {
            @Override
            public int getlength(String s) {
                return s.length();
            }
        };
//        System.out.println(l.getlength("Print String Length :"));
//
   }



    public static void printlength(StringlengthCount length){

        System.out.println(length.getlength("Hello Namrata"));
    }

    interface StringlengthCount{
       public int getlength(String s);
    }
}






