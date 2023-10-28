package ru.mirea.it.ivbo.seven;

interface Printable {
    void print();
}

class Book implements Printable {
    String name;
    public Book(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Book's name: " + name);
    }

}
class Magazine implements Printable {
    String name;
    public Magazine(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Magazine's name: " + name);
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable item : printables) {
            if (item instanceof Magazine) {
                Magazine magazine = (Magazine) item;
                magazine.print();
            }
        }
    }
}

public class Tester {
    public static void main(String[] args) {
        Book book1 = new Book("Book 1");
        Book book2 = new Book("Book 2");
        Magazine magazine1 = new Magazine("Magazine 1");
        Magazine magazine2 = new Magazine("Magazine 2");

        Printable[] printableItems = {book1, book2, magazine1, magazine2};

        System.out.println("All Printable Items:");
        for (Printable item : printableItems) {
            item.print();
        }

        System.out.println("Magazines Only:");
        Magazine.printMagazines(printableItems);
    }
}


