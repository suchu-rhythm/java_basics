package com.codewithme.java_basics;
public class HonoiTower {
    static int numberOfIterations = 0;
    public static void main(String args[]){
        int numberOfDisks = 4;
        char A = 'A';  //  A: Source
        char B ='B';   //  B: Auxilary
        char C = 'C';  //  C: Destination
            Fun_TowerOfHonoi(numberOfDisks,A,C,B);
        System.out.println("Total number of movement is :  "+numberOfIterations+ "  for "+numberOfDisks+" Disks.");
    }
            static void Fun_TowerOfHonoi(int m, char Source, char Destination, char Aux) {
                    ++numberOfIterations;

                if (m == 1) {
                    System.out.println("move disk " + m + " from " + Source + " to  " + Destination);

                    return;
                }

                Fun_TowerOfHonoi(m-1,Source,Aux,Destination);
                System.out.println("move disk " + m + " from " + Source + " to  " + Destination);

                Fun_TowerOfHonoi(m-1,Aux,Destination,Source);

            }
}

