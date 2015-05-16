package com.filbin.Arrays.Sorting.Bubble;

/**
 * Created by mfilbin on 4/21/15.
 */
public class Sorter {
    private int[] array;

    public Sorter(int[] toSort) {
        array = toSort;
    }

    public int[] sort() {
        int temp;
        boolean loop = true;

        while (loop) {
            loop = false;
            for (int i = 0; i < array.length -1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    loop = true;
                }
            }
        }

        return array;

    }
}
