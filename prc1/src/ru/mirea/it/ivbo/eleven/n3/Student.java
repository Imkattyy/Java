package ru.mirea.it.ivbo.eleven.n3;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Student implements Comparable<Student>{
    private final String name;
    private final int age;
    private final Date dateOfBirth;
    private final double GPA;

    public Student(String name, int age, Date dateOfBirth, double GPA) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Student student) {
        return Character.compare(this.name.charAt(0), student.name.charAt(0));
    }

    @Override
    public String toString() {
        return "Student: " + name + ", age: " + age  + "' GPA: " + GPA;
    }

    public static void swap(Student[] students, int indF, int indS) {
        Student t = students[indF];
        students[indF] = students[indS];
        students[indS] = t;
    }

    public void outDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dd.MM.yyyy HH:mm:ss");
        System.out.println("h:mm");
        System.out.println("dd-MMM-yyyy");
        String format = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        System.out.println(sdf.format(dateOfBirth));
    }
}
