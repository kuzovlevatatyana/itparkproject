package Lesson10;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {
        double f, c;
        f = c = 0;
        int a;

        Scanner scan = new Scanner(System.in);
        System.out.println("Нажмите 1 для конвертации C->F или 2 для конвертации F->C");
        a = scan.nextInt();
        if (a == 1)
            new Celsius();
        else
            new Fahrenheit();





    }


}



