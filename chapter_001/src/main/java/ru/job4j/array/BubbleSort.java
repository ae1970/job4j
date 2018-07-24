package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int[] array) {

        int tmp = 0;
        int k = array.length - 2;
        boolean is_swap = false;
        for (int i = 0; i <= k; i++) {
            is_swap = false;
            for (int j = k; j >= i; j--) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    is_swap = true;
                }
            }
            // Если перестановок не было, то выходимм
            if (is_swap == false) break;
        }
        return array;
    }
}
