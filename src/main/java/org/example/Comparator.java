package org.example;

public class Comparator {

    public int compare(int number1, int number2){
        if (number1 > 0 && number2 < 0) {
            return -1;
        }
        if (number1 > 0 && number2 > 0){
            return Integer.compare(number1, number2);
        }
        if (number1 < 0 && number2 > 0) {
            return 1;
        }
        if (number1 < 0 && number2 < 0){
            return Integer.compare(number2, number1);
        }
        return 0;
    }
}
