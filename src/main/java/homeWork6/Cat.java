package homeWork6;

public class Cat extends animal {

    private final int distRMax = 200;
    private final int distSMax = 0;

    static int countCat = 0;


        public static void printCountCat(){


            System.out.println("Колличество котов " + countCat);

        }






    public Cat(String name, int distR, int distS) {
        super(name, distR, distS);

        countCat ++;
    }

    @Override
    public void animalInfo() {
        System.out.println("Кот: " + name);
    }

    @Override
    public void animalRun() {
        if (distR > distRMax) {

            System.out.println("Ваш кот столько не пробежит");

        } else {
            System.out.println("Кот " + name + " пробежал " + distR + " метров");

        }
    }

    @Override
    public void animalSwim() {
        if (distS >= distSMax){
            System.out.println("Коты не плавают");
        }
    }



}
