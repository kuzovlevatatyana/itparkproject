package Lesson8;

public class AllAnimals {

    public static void main(String[] args) {
        Pets cat = new Pets("кот", "мяу");
        WildAnimal tiger  = new WildAnimal("тигр", "ррррр");

        cat.changeName("кошка");

        System.out.println(cat);
        System.out.println(tiger);

//        Animal [] AllAnimals = new Animal [] {cat, tiger};
//        for (Animal Animal: AllAnimals) {
//            Animal.changeName("зверята");
//
//            System.out.println("--------------");
//            System.out.println(cat);
//            System.out.println(tiger);
        }


    }

