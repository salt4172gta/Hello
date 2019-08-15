package com.crp;

import java.util.Random;

public class ArrayClasses {
    public static void main(String[] args) {
        long[] arr; //declare a array ,named arr .type is long
        arr = new long[20];//create a array,init length is 100
        Random random = new Random();
        for(int i=0;i<arr.length;i++){
//            System.out.println(random.nextInt(100));
            arr[i] = random.nextInt(20); //assign random int to arr

        }
//        for(long ar:arr){
//                System.out.println(ar);
//        }

        //search key
        int searchKey = 13;
        int j;
        for(j=0;j<arr.length;j++) {
            if (searchKey == arr[j]) {
                break;
            }
        }
            if(j == arr.length){
                System.out.println("can't find the search key");
            }
            else{
                System.out.println("the index is "+j);
                System.out.println("the number is "+arr[j]);
            }
    //delete from array is found the search key
        int searchKey1 = 10;
            int index;
            for(int i=0;i<arr.length;i++){
                System.out.printf("%-3d",arr[i]);
            }
            System.out.println();
            for(index=0;index<arr.length;index++){
                if(arr[index] == searchKey1){
                    break;
                }
            }
            if(index!=arr.length){
                for(int k=index;k<arr.length-1;k++){
                    arr[k]=arr[k+1];
                }
                for(int i=0;i<arr.length-1;i++){
                    System.out.printf("%-3d",arr[i]);
                }
            }
            else {
                System.out.println("can't find the searchKey "+searchKey1);
                for(int i=0;i<arr.length;i++){
                    System.out.printf("%-3d",arr[i]);
                }
            }



    }
}
