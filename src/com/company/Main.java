package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // schauen wir uns ein einfaches array an
        int[]feld = new int[] {1,2,3};

        //Hilfsmethode
        System.out.println(Arrays.toString(feld));
        System.out.println("----");

        //zwei dimensionen array im array
        int [][] feld2dim = new int[3][4];

        // einem element etwas zuweisen
        feld2dim[1][2] = 42;

        System.out.println(Arrays.toString(feld2dim[0])); // zeigt array in array
        System.out.println(Arrays.toString(feld2dim[1]));
        System.out.println(Arrays.toString(feld2dim[2]));

        // definition und Initialisierung
        int[][]feld2dim2 = new int[][]{{1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(feld2dim2[0]));
        System.out.println(Arrays.toString(feld2dim2[1]));



    }
}
