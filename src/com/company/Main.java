package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array");
        int size = scanner.nextInt();
        if (size > 0) {
            int[] array = ArrayGenerator.createArray(size);
            int[] sortingCombArray = SortingComb.sortingArray(array);
            ArrayOutput.consoleOutput(sortingCombArray);
        }else {
            System.out.println("The size of the array must be a positive number ");
        }
    }
}
