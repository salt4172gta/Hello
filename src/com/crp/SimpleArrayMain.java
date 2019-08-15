package com.crp;

import java.util.Random;

public class SimpleArrayMain {
    public static void main(String[] args) {
        SimpleArray sa = new SimpleArray(20);
        Random random = new Random();

        for(int i=0;i<20;i++){
            sa.setElems(i,random.nextInt(20));
        }
        sa.display();
        System.out.println();
        System.out.println(sa.getElems(10));
    }
}
