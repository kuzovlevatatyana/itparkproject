package Lesson2;

public class FirstProgram {

    public static void main(String[] args) {
        System.out.println("Привет, мир123");


        long summa = summa(3, 5);
        System.out.println(summa);
        long othersumma = summa(5, 5);
        System.out.println(othersumma);
        long yetanothersumma = summa(2, 18);
        System.out.println(yetanothersumma);

        long resultofminus = minus(2, 18);
        System.out.println(resultofminus);

        long result = multiplyandsumma(5);
        System.out.println(result);


    }

    /**
     * метод будет складывать два аргумента и возвращать результат этой операции
     *
     * @param arg1 первый аргумент
     * @param arg2 второй аргумент
     * @return результат сложения двух чисел
     */
    public static long summa(int arg1, int arg2) {
        int result = arg1 + arg2;
        return result;
    }

    public static long minus(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static long multiplyandsumma(int arg1) {
        int result = 3 * arg1 + 15;
        result = result - 38;
        result = 15;
        return result;

    }

    }