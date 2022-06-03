package homeWork6;

public class Dog extends animal{


    private final int distRMax = 500;

    private final int distSMax = 10;

    static int countDog = 0;


    public static void printCountDog(){


        System.out.println("Колличество собак " + countDog);

    }

    public Dog(String name, int distR, int distS) {
        super(name, distR, distS);
        countDog ++;
    }

    @Override
    public void animalInfo() {
        System.out.println("Пес: " + name);
    }

    @Override
    public void animalRun() {
        if (distR > distRMax) {

            System.out.println("Ваш пёс столько не пробежит");

        } else {
            System.out.println("Пёс " + name + " пробежал " + distR + " метров");

        }
    }

    @Override
    public void animalSwim() {
        if (distS > distSMax){
            System.out.println("Ваш пес столько не проплывет");
        }else {
            System.out.println("Пёс " + name + " проплыл " + distS + " метров");
        }
    }
}
