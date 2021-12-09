package Lesson10;

import java.util.Scanner;

public class Fahrenheit implements TemperatureConverter {
    public Fahrenheit() {
        double f, c;
        f = c =0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Пожалуйста, введите градусы по Фаренгейту");
        f = scan.nextDouble();
        c = (f - 32)*5/9;
        System.out.println(f + " градусов по Фаренгейту это " + c + " градусов по Цельсию.");

    }
}
