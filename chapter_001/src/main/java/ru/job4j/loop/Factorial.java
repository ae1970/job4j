package ru.job4j.loop;

public class Factorial {

    public int calc(int n) {
        // Если n = 0, возвращаем единицу
        if (n == 0) {
            return 1;

        }
        // Если n не равнo 0, вычисляем факториал числа n
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;

        }
        return fact;
    }
}
