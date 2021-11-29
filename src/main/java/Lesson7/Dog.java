package Lesson7;

public class Dog {
    public static void main(String[] args) {

        Animals dog = new Animals();
        dog.nameAnimals = "собака";
        dog.nickname = "Сэм";
        dog.run = 450;
        dog.swim = 9;
        dog.maxrun = 501;
        dog.maxswim = 11;

        dog.RunAction(dog.run);
        dog.SwimAction(dog.swim);


    }
    }