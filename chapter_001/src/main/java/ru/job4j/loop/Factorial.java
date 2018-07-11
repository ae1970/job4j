package ru.job4j.loop;

public class Factorial {

    public int calc(int n) {
        int fact = 1;

        if (n != 0) {
            // Если n не равнo 0, вычисляем факториал числа n

            for (int i = 2; i <= n; i++) {
                fact *= i;

            }
        }
        return fact;
    }
}
