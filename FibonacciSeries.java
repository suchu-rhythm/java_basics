package com.codewithme.java_basics;

public class FibonacciSeries {
    public static void main(String args[]){
        int a = 0;
        int b = 1;
        int c = 0 ;
        for(int i = 0; i < 20; i++){

            System.out.print(a);
            c = a ;
            a = b + c ;
            b = c ;
            System.out.print(" ");

        }
    }
}
