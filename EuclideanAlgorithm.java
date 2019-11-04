package com.codewithme.java_basics;

public class EuclideanAlgorithm {
    public static void main(String args[]) {
        int a = 85;
        int b = 15;
        int result = EuclideanFun(a, b);

        System.out.println(result);

    }
    public static int EuclideanFun(int a, int b){
        int a1 = a;
        int b1 = b;
        int c = b1;
        b1 = a1 % b1 ;
        if(b1>0)
          return  EuclideanFun(c,b1);

       else  return c;

    }
}
