package com.crp;

class Person {
    public String name;
    public static int eyeNum;
}

public class Person1 {
    public static void main(String[] args) {

        System.out.println("person static variable "+Person.eyeNum);
        Person p = new Person();
        System.out.println(p.name+p.eyeNum);

        p.name = "Salt";
        p.eyeNum = 100;
        System.out.println(p.name + p.eyeNum);
    }
}

