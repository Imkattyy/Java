package ru.mirea.it.ivbo.two;

// Создать класс,описывающий книгу(Book).В классе должны быть описаны нужные свойства книги(автор,название,
// год написания и т.д.)и методы для получения,изменения этих свойств.Протестировать работу класса в классе
// BookTest,содержащим метод статический main(String[]args).Создать класс книжная полка,в котором поля данных класса
// это массив объектов типа книги(Book,и количество книг на книжной полке.Написать методы класса,которые возвращают
// книги с самым поздним и самым ранним сроком издания.Написать метод класса,позволяющий расставить книги
// на книжной полке в порядке возрастания года выпуска.Используйте реализацию отношений композиция классов.

import java.util.Arrays;
import java.util.Scanner;

class Book {
    private String author;
    private String title;
    private int year;

    // Конструктор новой книги
    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" + "author='" + author + '\'' + ", title='" + title + '\'' + ", year='" + year + '}';
    }
}

class BookShelf {
    private Book[] books;
    private int bookCount;

    public BookShelf(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("No places on the bookshelf.");
        }
    }

    public Book getEarliestBook() {
        if (bookCount == 0)
            return null;

        Book earliestBook = books[0];
        for (int i = 1; i < bookCount; i++) {
            if (books[i].getYear() < earliestBook.getYear())
                earliestBook = books[i];
        }
        return earliestBook;
    }

    public Book getLatestBook() {
        if (bookCount == 0)
            return null;

        Book latestBook = books[0];
        for (int i = 1; i < bookCount; i++) {
            if (books[i].getYear() < latestBook.getYear())
                latestBook = books[i];
        }
        return latestBook;
    }

    public void sortBooksByYear() {
        Arrays.sort(books, 0, bookCount, (book1, book2) -> Integer.compare(book1.getYear(), book2.getYear()));
    }

    public void displayBooks() {
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
    }
}

public class BookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of books: ");
        int capacity = scanner.nextInt();
        scanner.nextLine(); // Очищаем буфер после ввода числа

//        Book book1 = new Book("Murakami", "Pinball 1973", 1983);
//        Book book2 = new Book("Murakami", "Norwegian Wood", 1987);
//        Book book3 = new Book("Murakami", "Hear the Wind Sing", 1979);

        BookShelf bookshelf = new BookShelf(capacity);
        for (int i = 0; i < capacity; i++) {
            System.out.println("Input the book information " + (i + 1) + ":");

            System.out.print("Author: ");
            String author = scanner.nextLine();

            System.out.print("Title: ");
            String title = scanner.nextLine();

            System.out.print("The year of writing: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Очищаем буфер после ввода числа

            Book book = new Book(author, title, year);
            bookshelf.addBook(book);
        }

        bookshelf.getEarliestBook();
        bookshelf.getLatestBook();

        System.out.println("\nWhat if I want to add one more book?");
        Book book2 = new Book("Murakami", "Norwegian Wood", 1987);
        bookshelf.addBook(book2);
        System.out.println("Ok, no problem");

        System.out.println("\nBooks on the bookshelf:");
        bookshelf.displayBooks();

        bookshelf.sortBooksByYear();

        System.out.println("\nSorted books on the bookshelf:");
        bookshelf.displayBooks();

        scanner.close();
    }

}