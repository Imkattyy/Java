package ru.mirea.it.ivbo.four1;


class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }
}


@SuppressWarnings("ALL")
class Reader {
    private String fullname;
    private double idNumber;
    private String college;
    private String dateOfBirth;
    private double phoneNumber;

    public Reader(String fullname, double idNumber, String college, String dateOfBirth, double phoneNumber) {
        this.fullname = fullname;
        this.idNumber = idNumber;
        this.college = college;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }


    public void takeBook(int nBooks) {
        System.out.println(this.fullname + " взял(а) " + nBooks + " книг(и)." + '\n');
    }

    public void takeBook(String ... books) {
        System.out.println(this.fullname + " взял(а) книги: ");
        for (String book : books)
            System.out.println(book);
        System.out.println();
    }

    public void takeBook(Book ... books) {
        System.out.println(this.fullname + " взял(а) книги: ");
        for (Book book : books)
            System.out.println(book.getTitle());
        System.out.println();
    }

    public void returnBook(int nBooks) {
        System.out.println(this.fullname + " вернул(а) " + nBooks + " книг(и) + '\n");
    }

    public void returnBook(String ... books) {
        System.out.println(this.fullname + " вернул(а) книги: ");
        for (String book : books)
            System.out.println(book);
        System.out.println();
    }

    public void returnBook(Book ... books) {
        System.out.println(this.fullname + " вернул(а) книги: ");
        for (Book book : books)
            System.out.println(book.getTitle());
        System.out.println();
    }


    public static void main(String[] args) {
        Reader[] readersList = new Reader[2];
        readersList[0] = new Reader("Misha", 312, "CS", "21.10.2000", 1234);
        readersList[1] = new Reader("Masha", 313, "CS", "11.05.2001", 1235);

        readersList[0].takeBook(1);
        readersList[1].takeBook("Harry Potter", "Science");
        readersList[0].returnBook("Jack Harris saves the world");
    }
}
