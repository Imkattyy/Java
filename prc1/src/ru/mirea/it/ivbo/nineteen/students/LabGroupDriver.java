package ru.mirea.it.ivbo.nineteen.students;

import java.util.ArrayList;
import java.util.List;

public class LabGroupDriver {
    public static void main(String[] args) {
        Student student = new Student("Frank", 19, 0);
        Student student1 = new Student("David", 184, 4.5);
        Student student2 = new Student("Petra", 45, 0);
        Student student3 = new Student("James", -1, Double.MIN_VALUE + 1);
        Student[] students = new Student[]{student, student1, student2, student3};
        LabGroupUI labClassUI = new LabGroupUI(new ArrayList<Student>(List.of(students)));
    }
}
