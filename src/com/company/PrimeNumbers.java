package com.company;

public class PrimeNumbers {
    /**
     * Use loops to display all prime numbers from 1 to 100.
     * A prime number is a number that is only divisible by one or
     * on itself. The first prime numbers are 2,3,5,7...
     */
    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i;
            int remainder = 0;
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[i] != 0) {
                    if (numbers[i] % j == 0) {
                        remainder++;
                    }
                }
            }
            if (remainder == 2) {
                System.out.println(numbers[i]);
            }
        }
    }
}
