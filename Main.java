package com.codewithme;

public class Main {
    public static void space1(){
        System.out.print("  ");
    }

    public static void main(String[] args) {
        int number = 15;
	    System.out.println("Hello World...");
        for (int i = 1; i <= number; i++) {

            for (int j = i; j<number; j++) {
                    space1();
                }
                for (int k = 1; k <= (i*2-1); k++) {
                    System.out.print("* ");
                /*    if( k == i || i == number || k == (i * 2 -1)) {
                        System.out.print("* ");
                    }
                    else if(k>i)
                        System.out.print("* ");

                 */


                }

            for (int j = i; j<number; j++) {
                    space1();
                }


            System.out.println("");

        }
    }
}
