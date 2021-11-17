package Lesson4;

public class lesson4 {

    public static void main(String[] args) {

        System.out.println(sqrt(25, 0.0000001));
        System.out.println(Math.sqrt(25));
    }

    private static double sqrt(double a, double err) {
        double x0 = a;
        double x1 = 1 / 2.0 * (x0 + a / x0);
        double d = Math.abs(x1 - x0);
        for (; d>=2 * err && d * d >= 2 * err;) {
            x0 = x1;
            x1 = 1 / 2.0 * (x0 + a / x0);
            d = Math.abs(x1 - x0);
        }
        return x1;
    }
}
