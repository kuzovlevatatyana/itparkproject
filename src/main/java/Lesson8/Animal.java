package Lesson8;


public class Animal {

    private String name;
    private String voice;

    public Animal (String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", voice='" + voice + '\'' +
                '}';
    }


    }



