package Lesson9;

public class Truck extends Automobile {
    public Truck(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        if (getDistance() >= 1200) {
            System.out.println("Нет бензина");
        } else
            System.out.println(this.getBrand() + " проехал " + getDistance() + " км.");
        }
    }

