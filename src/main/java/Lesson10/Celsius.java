package Lesson10;

import java.util.Scanner;

public class Celsius extends TempConverter{
     public Celsius() {
        double f;
        double c;        ;
        f = c = 0;

         Scanner scan = new Scanner(System.in);
         System.out.println("Пожалуйста введите градусы по Цельсию");
         c = scan.nextDouble();
         f = c * 9/5 +32;
         System.out.println(c + " градусов по Цельсию это " + f + " градусов по Форенгейту.");

    }
}
