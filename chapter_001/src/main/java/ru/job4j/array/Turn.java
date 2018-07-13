package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++ ) {


            if (array.length % 2 == 0) {
                if (array.length/2 == i) break;
                temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            } else {
                if ((array.length-1)/2 == i) break;
                temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }

        }
        return array;
    }
}
