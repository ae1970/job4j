package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MergeSortArraysTest {
    @Test
    public void whenMergeSortedArrays() {

        MergeSortArrays array = new MergeSortArrays();
        int[] sortedArray1 = {1, 3, 5, 8, 23, 888};
        int[] sortedArray2 = {0, 2, 6, 7, 25, 900};
        int[] result = array.merge(sortedArray1, sortedArray2);
        int[] expected = {0, 1, 2, 3, 5, 6, 7, 8, 23,  25, 888, 900};
        assertThat(result, is(expected));
    }

    @Test
    public void whenMergeSortedArrays2() {

        MergeSortArrays array = new MergeSortArrays();
        int[] sortedArray1 = {7, 11, 15, 78, 200};
        int[] sortedArray2 = {8, 10, 18, 208};
        int[] result = array.merge(sortedArray1, sortedArray2);
        int[] expected = {7, 8, 10, 11, 15, 18, 78, 200, 208};
        assertThat(result, is(expected));
    }

    @Test
    public void whenMergeSortedArrays3() {

        MergeSortArrays array = new MergeSortArrays();
        int[] sortedArray1 = {3, 8, 115, 117, 185};
        int[] sortedArray2 = {5, 10, 12, 199, 302};
        int[] result = array.merge(sortedArray1, sortedArray2);
        int[] expected = {3, 5, 8, 10, 12, 115, 117, 185, 199, 302};
        assertThat(result, is(expected));
    }
}
