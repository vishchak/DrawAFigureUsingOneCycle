package com.company;

import java.util.Scanner;

public class FigureDrawing {
    /**
     * With the help of a cycle (only one) draw such a figure. And
     * the maximum height of this figure is entered from the keyboard (in the example
     * maximum height - 4)
     * *
     * **
     * ***
     * ****
     * ***
     * **
     * *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input height");
        int height = sc.nextInt();
        char stars = '*';
        String totalStars = "";

        for (int i = 0; i < height * 2 - 1; i++) {
            if (i < height) {
                totalStars += stars;
            } else totalStars = totalStars.substring(0,totalStars.length()-1);

            System.out.println(totalStars);
        }
    }
}
