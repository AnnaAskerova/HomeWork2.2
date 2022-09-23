import Car.Car;
import Human.Human;

public class Main {
    public static void main(String[] args) {
        Human max = new Human(null, "Минск", "бренд-менеджер");
        Human ann = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        Human kate = new Human("Катя", "Калининград", 1994, null);
        Human artyom = new Human("Артем", "Москва", 1995, "мамкин директор");
        System.out.println(max);
        System.out.println(ann);
        System.out.println(kate);
        System.out.println(artyom);
        Car lada = new Car("Lada", null, "желтый", 2015, "Россия", 1.7f);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", null, "Германия", 3.0f);
        Car bmw = new Car("BMW", "Z8", "черный", 2021, "Германия", 3.0f);
        Car kia = new Car(null, "Sportage 4 поколение", "красный", 2018, null, 2.4f);
        Car hyundai = new Car("Hyundai", "Avante", "оранжевый", "Южная Корея");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

    }
}
