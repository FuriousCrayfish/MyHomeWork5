public class Empl {

    private String fio;
    private String pos;
    private String eMail;
    private int phone;
    private int zp;
    private int age;
    private  int id;

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        if(age < 18){
            System.out.println("Пошел вон малолетка");
        }else {

            this.age = age;
        }
    }

    public Empl(int id, String fio, String pos, String eMail, int phone, int zp, int age){

     this.id = id;
     this.fio = fio;
     this.pos = pos;
     this.eMail = eMail;
     this.phone = phone;
     this.zp = zp;
     this.age = age;

    }



    public void printConsole(){

        System.out.println(id + ". Имя: " + fio);
        System.out.println("должность: " + pos);
        System.out.println("Почта: " +  eMail);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + zp);
        System.out.println("Возраст: " + age);
        System.out.println();

    }

}
