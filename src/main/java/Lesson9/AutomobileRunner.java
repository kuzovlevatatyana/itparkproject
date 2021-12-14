package Lesson9;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class AutomobileRunner {

    public static void main(String[] args) {
        int getDistance = (int) (Math.random()*1000);
        Automobile opel = new Car("opel");
        Automobile chevrolet = new Car("chevrolet");
        Automobile Audi = new Car("Audi");
        Automobile KIA = new Car("KIA");
        Automobile Honda = new Car("Honda");
        Automobile Kamaz = new Truck("Kamaz");
        Automobile Volvo = new Truck("Volvo");
        Automobile Man = new Truck("Man");
        Automobile Scania = new Truck("Scania");
        Automobile Mack = new Truck("Mack");

        for (Automobile automobile : Arrays.asList(opel, chevrolet, Audi, KIA, Honda, Kamaz, Volvo, Man, Scania,
                Mack)) {
            automobile.move();
        }
            }
        }


