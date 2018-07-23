package ru.job4j.array;

public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        // проверить. что массив data имеет первые элементы одинаковые с value
        for(int j = 0; j < value.length; j++) {

            //System.out.print(s1[i]);
            if (data[j] != value[j]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
