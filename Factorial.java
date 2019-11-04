package com.codewithme.java_basics;

public class Factorial {
    public static void main(String args[]){
        System.out.println("Factorial...");
        int a = CalculateFactorial(6);
        System.out.println(a);
    }
    static int CalculateFactorial(int n){
        if(n>=1)
        return n * CalculateFactorial(n -1);
        else return 1 ;
    }
}
