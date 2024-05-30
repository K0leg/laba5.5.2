package com.company;

public class third {

    public static void main(String[] args) {

        double number = Math.round(Math.random() * 100);
        int num = (int)number;
        int n1, n2, n3;

        n1 = num / 100;
        n2 = (num % 100) / 10;
        n3 = num % 10;

        System.out.println("Число: " + num);
        if (n1 != 0){
            System.out.println("Кількість цифер: 3");
        }
        else if (n1 == 0 && n2 != 0){
            System.out.println("Кількість цифер: 2");
        }
        else if (n1 == 0 && n2 == 0 && n3 != 0){
            System.out.println("Кількість цифер: 1");
        }
        else if (n1 == 0 && n2 == 0 && n3 == 0){
            System.out.println("Кількість цифер: 0");
        }
    }
}