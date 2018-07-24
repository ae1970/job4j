package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        // тест, проверяющий сортировку массива из 10 элементов методом пузырька
        BubbleSort bubble = new BubbleSort();
        int[] inArray = {9, 2, 5, 8, 4, 1, 7, 6, 0, 3};
        int[] result = bubble.sort(inArray);
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result, is(expected));
    }
}
