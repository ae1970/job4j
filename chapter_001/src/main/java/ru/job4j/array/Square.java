package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        int j = 1;
        for(int i = 0; i < bound; i++) {
            rst[i] = (int) Math.pow(j, 2);
            j++;
        }
        return rst;
    }
}