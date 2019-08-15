package com.crp;

public class SimpleArray {
    private long[] arrayes;
    public SimpleArray(int size){
        arrayes = new long[size];
    }
    public  void setElems(int index,long value){
        arrayes[index] = value;
    }
    public long getElems(int index){
        return arrayes[index];
    }
    public void display(){
        for(long arr:arrayes){
            System.out.printf("%3d",arr);
        }
    }
}
