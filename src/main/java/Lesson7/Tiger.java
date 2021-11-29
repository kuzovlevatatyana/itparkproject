package Lesson7;

public class Tiger {
    public static void main(String[] args) {

        Animals tiger = new Animals();
        tiger.nameAnimals = "тигр";
        tiger.nickname = "Алекс";
        tiger.run = 450;
        tiger.swim = 1000;
        tiger.maxrun = 701;
        tiger.maxswim = 900;

        tiger.RunAction(tiger.run);
        tiger.SwimAction(tiger.swim);

    }
    }