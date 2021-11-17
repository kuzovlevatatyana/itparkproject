package lesson3;

public class ThirdLesson {

    public static void main(String[] args) {

        double a, b, c;
        double x1, x2;

        a = 12;
        b = 13;
        c = 15;

        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0"); // на 0 делить нельзя
        }
        double Discriminant = b*b - 4 * a * c;

        if (Discriminant == 0) {
            x1 = (-b) / (2 * a);
            System.out.printf("x1 = %s", x1);
        }
        else if (Discriminant > 0) {
            x1 = (-b + Math.sqrt(Discriminant))/(2 * a);
            x2 = (-b - Math.sqrt(Discriminant))/(2 * a);
            System.out.printf("x1 = %s, x2 = %s", x1, x2);
            }
        else {
                System.out.println("Нет действительных решений уравнения"); //т.к. дискриминант < 0, корней нет
            }


        }
        }









