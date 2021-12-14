package Lesson9;

public abstract class Automobile {

    private String brand;
    private int distance;

    public Automobile(String brand) {
        this.brand = brand;
        this.distance = (int) (Math.random()*1000);
    }
    public String getBrand() {
        return brand;
    }

    public int getDistance() {
        return distance;
    }
    public abstract void move();
}


