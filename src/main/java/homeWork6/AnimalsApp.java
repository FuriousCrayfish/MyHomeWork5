package homeWork6;

public class AnimalsApp {

    public static void main(String[] args) {

        Cat cat = new Cat("Барсик", 150, 10);
        cat.animalInfo();
        cat.animalRun();
        cat.animalSwim();

        System.out.println();

        Cat cat1 = new Cat("Васька", 250, 0 );
        cat1.animalInfo();
        cat1.animalRun();
        cat1.animalSwim();

        System.out.println();

        Dog dog = new Dog("Сэм", 450, 8);
        dog.animalInfo();
        dog.animalRun();
        dog.animalSwim();

        System.out.println();

        Dog dog1 = new Dog("Гавкошмыг", 501, 11);
        dog1.animalInfo();
        dog1.animalRun();
        dog1.animalSwim();

        System.out.println();

        Dog dog2 = new Dog("Малыш", 325, 38);
        dog2.animalInfo();
        dog2.animalRun();
        dog2.animalSwim();

        System.out.println();

        Dog dog3 = new Dog("Найда", 160, 6);
        dog3.animalInfo();
        dog3.animalRun();
        dog3.animalSwim();

        System.out.println();

        Cat.printCountCat();
        System.out.println();
        Dog.printCountDog();

    }

}
