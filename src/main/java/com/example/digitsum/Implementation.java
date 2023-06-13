package com.example.digitsum;

public class Implementation {
    public int calcDigitSum(int number){


        int sum = 0;
        while (number> 0) {

            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
