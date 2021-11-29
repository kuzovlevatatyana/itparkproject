package Lesson7;

public class Animals {
    String nameAnimals;
    String nickname;
    int run;
    int swim;
    int maxrun;
    int maxswim;


    public String getNameAnimals() {
        return nameAnimals;
    }

    public String getNickname() {
        return nickname;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }

    public void RunAction(int run) {
        if ((run < maxrun) && (run >= 0)) {
            System.out.println(getNameAnimals() +" " + getNickname() +  " Пробежал/а " + getRun() + " м. ");
        } else {
            System.out.println("Ошибка данных, " + getNameAnimals() + " " + getNickname() + " не может" +
                    " пробежать " + getRun() + " м. ");
        }
    }

    public void SwimAction(int swim) {
        if ((swim < maxswim) && (swim > 0)) {
            System.out.println(getNameAnimals() + " " + getNickname() + " проплыл/а " + getSwim() + " м. ");
        } else if (maxswim == 0) {
            System.out.println(getNameAnimals() + " " + getNickname() + " не умеет плавать ");
        } else {
            System.out.println("Ошибка данных, " + getNameAnimals() + " " + getNickname() +
                    " не может проплыть " + getSwim() + " м. ");
        }
    }
}





