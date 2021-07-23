package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (size > 0) {
            int[] array = ArrayGenerator.createArray(size);
            int[] sortingCombArray = SortingComb.sortingArray(array);
        }
    }
}
