package Lesson9;

public class Car extends Automobile {
        public Car(String brand) {
                super(brand);
        }

        @Override
        public void move() {
                if (getDistance() >= 500) {
                        System.out.println("Бензина нет");
                }
                else
                        System.out.println(this.getBrand() +" " + " проехал " + this.getDistance() +" км.");
        }

}



