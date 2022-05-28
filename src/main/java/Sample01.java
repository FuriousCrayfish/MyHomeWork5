public class Sample01 {

    public static void main(String[] args) {

        Empl empl1 = new Empl(1, "Петров В. С.", "Слесарь", "PVS@mail.ru", 4499, 50000, 50);
        empl1.printConsole();

        Empl empl2 = new Empl(2, "Колычев В. К.", "Слесарь", "KOL@mail.ru", 4540, 50000, 35);
        empl2.printConsole();

        Empl empl3 = new Empl(3, "Сметанин А. С.", "Слесарь", "SAS@mail.ru", 4210, 50000, 28);
        empl3.printConsole();

        Empl empl4 = new Empl(4,"Шаповалов Ю. Н.", "Мастер", "SUN@mail.ru", 4420, 70000, 55);
        empl4.printConsole();

        Empl empl5 = new Empl(5,"Сальников В. Г.", "НачЦех", "SVG@mail.ru", 5387, 90000, 57);
        empl5.setAge(10);
        empl5.printConsole();

        System.out.println(empl5.getAge());

        Empl[] emplArray = new Empl[5];
        emplArray[0] = new Empl(1, "Петров В. С.", "Слесарь", "PVS@mail.ru", 4499, 50000, 50);
        emplArray[1] = new Empl(2, "Колычев В. К.", "Слесарь", "KOL@mail.ru", 4540, 50000, 35);
        emplArray[2] = new Empl(3, "Сметанин А. С.", "Слесарь", "SAS@mail.ru", 4210, 50000, 28);
        emplArray[3] = new Empl(4,"Шаповалов Ю. Н.", "Мастер", "SUN@mail.ru", 4420, 70000, 55);
        emplArray[4] = new Empl(5,"Сальников В. Г.", "НачЦех", "SVG@mail.ru", 5387, 90000, 57);

        for(int i = 0; i< emplArray.length;i++){

            if(emplArray[i].getAge() > 40){
                emplArray[i].printConsole();
            }

        }
    }


}
