package com.codewithme.java_basics;
import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        System.out.println("Factorial...");
        Scanner sc = new Scanner (system.in);
        int num = sc.nextInt();
        int a = CalculateFactorial(num);
        System.out.println(a);
    }
    static int CalculateFactorial(int n){
        if(n>=1)
        return n * CalculateFactorial(n -1);
        else return 1 ;
    }
}
