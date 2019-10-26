package com.codewithme;

public class Itteration {
    public static void main(String args[]){
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
             /*   for (int k = i-1; k >=1 ; k--) {    // different block for different style
                    System.out.print(k);
                }

              */
            System.out.println();

        }
    }
}
