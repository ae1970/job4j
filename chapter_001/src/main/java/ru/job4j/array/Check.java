package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;

        if(data[0]) {

            for (boolean b : data) {
                if (!b) {
                    return  result = false;

                }
            }
            return result = true;


        } else {

            for (boolean b : data) {
                if (b == true) {
                    result = false;

                }
            }
            return result = true;

        }

    }

}


