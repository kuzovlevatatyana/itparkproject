package Lesson6;

import java.util.Scanner;

public class MaxMinAvg {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number;
        number = scanner.nextInt();
        System.out.println("Вы ввели число " + number);

        double [] array = new double [number];
        for (int i = 0; i < array.length; i++) {
            array [i] = Math.random();
        }
        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array [i];
            if (min > array[i])
                min = array[i];
            avg += array[i]/ array.length;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
    }










