package com.company;

import java.util.Scanner;

public class fourth {

    public static void main(String[] args) {

        int array1[] =  new int[3];
        int array2[] =  new int[3];
        int counter = 0;

        for (int i = 0; i < 3; i++){
            array1[i] = (int) Math.round(Math.random() * 2+1);
//            System.out.println(array1[i]);
        }

        for (int i = 0; i < 2; i++) {
            Scanner scanner = new Scanner(System.in);
            for (int g = 0; g < 3; g++) {
                System.out.print("Вгадай число: ");
                array2[g] = scanner.nextInt();
            }
            counter++;

            if (array1[0] == array2[0] && array1[1] == array2[1] && array1[2] == array2[2]) {
                System.out.println("You win !!!");
                break;
            } else if (counter < 2){
                System.out.println("Попробуй ще раз");
            } else if (counter == 2) {
                System.out.println("Game over \n" + "Ви використали всі спроби!");
                break;
            }
        }
    }
}