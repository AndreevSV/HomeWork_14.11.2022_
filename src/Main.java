public class Main {
    public static void main(String[] args) {

        Human maksim = new Human("Максим", -1998, "", "бренд-менеджер");
        Human anna = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human kate = new Human("Катя", 1992, "Калиниград", "продакт-менеджер");
        Human artem = new Human("Артем", 1995, "Москва", "");



        System.out.println(maksim);
        System.out.println(anna);
        System.out.println(kate);
        System.out.println(artem);

        Car ladaGranta = new Car("Lada", "Granta", 1.7, "желтого", 2015, "России");
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черного", 2020, "Германии");
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "черного", 2021, "Германии");
        Car kiaSportage = new Car("Kia", "Sportage", 2.4, "красного", 2018, "Южной Корее");
        Car hyundaiAvante = new Car("Hyandai", "", -1.6, null, -2016, "Южной Корее");

        System.out.println();
        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);

    }
}