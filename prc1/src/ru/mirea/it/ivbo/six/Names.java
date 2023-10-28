package ru.mirea.it.ivbo.six;

//Создать интерфейс Nameable, с методом getName(), возвращающим имя объекта, реализующего интерфейс. Проверить
// работу для различных объектов (например, можно создать классы, описывающие разные сущности, которые могут иметь
// имя: планеты, машины, животные и т. д.).

interface Nameable {
    String returnName();
}

class Car implements Nameable {
    private String model;
    public Car(String model) {
        this.model = model;
    }

    public String returnName() {
        return this.model;
    }
}

class Cat implements Nameable {
    private String name;
    public Cat(String name) {
        this.name = name;
    }

    public String returnName() {
        return this.name;
    }
}
public class Names {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik");
        Car toyota = new Car("RAV4");

        System.out.println(barsik.returnName());
        System.out.println(toyota.returnName());
    }
}
