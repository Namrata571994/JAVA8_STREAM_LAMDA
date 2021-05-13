package com.java8;

public class StudentPojo {

    private int age;
    private String fname;
    private String lName;

    public StudentPojo(int age, String fname, String lName) {
        this.age = age;
        this.fname = fname;
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "StudentPojo{" +
                "age=" + age +
                ", fname='" + fname + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}
