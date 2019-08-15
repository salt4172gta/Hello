package com.crp;

public class FinalTest {
    public static void main(String[] args) {
        T t = new T();
        t.m(100);

    }
}

class T{
//    final  int i = 100;
    public  void m(final int j){
        System.out.println(j);
    }
}

class TT extends T{
    public void m(int j){
        System.out.println(j);
    }
}
