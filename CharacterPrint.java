package com.codewithme;
public class CharacterPrint {
    public static void main(String args[]){
        int n = 19;
        for (int i = 0; i < n; i++) {
            char c = 65;
            for (int j = 0; j <=i; j++) {
                System.out.print(c);
                System.out.print(" ");
                c++;
            }
            System.out.println();

        }
    }


}
