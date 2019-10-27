package com.codewithme;

public class SquarePattern {
    public  static void main(String args[]){
<<<<<<< HEAD
        byte b = 19;
=======
        byte b = 15;
>>>>>>> 3066a09efb2187c75ce138e50d165999533c36dc
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

