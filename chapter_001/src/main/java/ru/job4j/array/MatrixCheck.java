package ru.job4j.array;

public class MatrixCheck {

    public boolean mono(boolean[][] data) {
        boolean result = true;
        boolean flag1 = data[0][0];

        for (int i = 1,j = 1; i < data.length; i++, j++) {
            if(flag1 != data[i][j]) {
                result = false;
                break;
            }
        }

        boolean flag2 = data[0][data.length - 1];
        for (int i = 0, j = data.length - 1; i < data.length; i++, j--) {
            if(flag2 != data[i][j]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
