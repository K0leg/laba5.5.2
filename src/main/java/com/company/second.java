package com.company;

import java.util.Scanner;

public class second {

    public static void main(String[] args) {

//        System.out.println("Периметир трикутника: " + (3+4+5) + "\nПлоща трикутника: " + (3*4*1/2));

        int array[] = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Вкажіть катет: ");
            int number = scanner.nextInt();
            array[i] = number;
        }

        array[2] = (int) Math.sqrt(Math.pow(array[0], 2) + Math.pow(array[1], 2));
        System.out.println("Площа: " + (array[0] * array[1] * 1/2) + "\n" + "Периметир: " + (array[0] + array[1] + array[2]));
    }

}