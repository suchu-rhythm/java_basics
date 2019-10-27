package com.codewithme;

public class SquarePattern {
    public  static void main(String args[]){
        byte b = 19;
        for (int i = 0; i <= b; i++) {
            for (int j = 0; j <=b; j++) {
                if(i==0 || i == b || j== 0 || j == b || (i == j)|| (j== (b-i))){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
}

