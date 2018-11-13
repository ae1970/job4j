package ru.job4j.array;
import java.util.Arrays;

public class MergeSortArrays {
    public static int[] merge(int[] a, int[] b) {
        /**
         * Объединяет два отсортированных массива в один и сортирует его.
         * @param1 a Первый отсортированный массив.
         * @param2 b Второй отсортированный массив
         * @return Возвращает общий массив в отсортированном виде
         */
        int[] array = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length)
            array[k++] = a[i] < b[j] ? a[i++] :  b[j++];

        while (i < a.length)
            array[k++] = a[i++];


        while (j < b.length)
            array[k++] = b[j++];

        return array;
    }
}
