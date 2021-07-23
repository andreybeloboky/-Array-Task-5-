package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (size > 0) {
            int[] array = ArrayGenerator.createArray(size);
            int[] sortingCombArray = SortingComb.sortingArray(array);
            for (int i = 0; i<array.length; i++){
                System.out.println(sortingCombArray[i]);
            }
        }else {
            System.out.println("The size of the array must be a positive number ");
        }
    }
}
