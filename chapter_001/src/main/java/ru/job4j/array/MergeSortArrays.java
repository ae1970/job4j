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
        int array[]=new int[a.length + b.length];
        System.arraycopy(a,0, array, 0, a.length);
        System.arraycopy(b,0, array, a.length, b.length);
        Arrays.sort(array);

        return array;
    }
}
