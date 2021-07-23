package com.company;

import java.util.Scanner;

/*
 * @size - indicates the size of the array passed by the user;
 * @return - filled array  ;
 */
public class ArrayGenerator {
    public static int[] createArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Fill in the cell");
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
