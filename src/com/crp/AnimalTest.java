package com.crp;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("name");
        Dog d = new Dog("dogname","black");
        Cat c = new Cat("catname","redcolor");
        System.out.println(a instanceof Animal);
        System.out.println(c instanceof Animal);
        System.out.println(d instanceof Animal);
        System.out.println(a instanceof Cat);
        System.out.println(a instanceof Dog);
        a = new Dog("dogname1","white");

        System.out.println(a instanceof Dog);
        System.out.println(a instanceof Animal);
        System.out.println(a.name);
//        System.out.println(a.eyesColor);
        Dog d1 = (Dog)a;
        System.out.println(d1.eyesColor);
    }
}
class Animal{
    public String name;
    Animal(String name){
        this.name = name;
    }
}
class Dog extends Animal{
    public String eyesColor;
    Dog(String name,String eyesColor){
        super(name);
        this.eyesColor = eyesColor;
    }
}
class Cat extends Animal{
    public String furColor;
    Cat(String name,String furColor){
        super(name);
        this.furColor = furColor;
    }
}
