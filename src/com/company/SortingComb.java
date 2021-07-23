package com.company;

public class SortingComb {
    public static int[] sortingArray(int[] array) {
        int step = array.length;
        while (step > 0) {
            step = step - 1;
            for (int i = 0; i + step < array.length; i++) {
                if (array[i] > array[i + step]) {
                    int temp = array[i];
                    array[i] = array[i + step];
                    array[i + step] = temp;
                }
            }
        }
        return array;
    }
}
