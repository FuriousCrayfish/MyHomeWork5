package homeWork6;

public class animal {

    //Создаю переменные имени, дистанции бега, дистанции плавания

    protected String name;

    protected int distR;

    protected int distS;

    //Создаю конструктор, геттеры и сеттеры

    public animal(String name, int distR, int distS) {
        this.name = name;
        this.distR = distR;
        this.distS = distS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistR() {
        return distR;
    }

    public void setDistR(int distR) {
        this.distR = distR;
    }

    public int getDistS() {
        return distS;
    }

    public void setDistS(int distS) {
        this.distS = distS;
    }

    public void animalInfo(){ // информация о животном

        System.out.println("Животное: " + name);

    }

    public void animalRun(){ // информация о том, сколько животное пробежало

        System.out.println("Животное " + name + " пробежало " + distR + " метров");

    }

    public void animalSwim(){ // информация о том, сколько животное проплыло

        System.out.println("Животное " + name + " проплыло " + distS + " метров");

    }

}
