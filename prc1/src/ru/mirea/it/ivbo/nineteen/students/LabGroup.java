package ru.mirea.it.ivbo.nineteen.students;

import java.util.ArrayList;
import java.util.Arrays;

public class LabGroup {
    ArrayList<Student> students;

    public LabGroup(ArrayList<Student> students) {
        Student[] sortedStudentsArray = students.toArray(new Student[0]);
        Student.mergeSort(sortedStudentsArray, 0, students.size() - 1);
        this.students = new ArrayList<>(Arrays.asList(sortedStudentsArray));
    }

    public void sortStudents() {
        Student[] sortedStudentsArray = students.toArray(new Student[0]);
        Student.mergeSort(sortedStudentsArray, 0, students.size() - 1);
        students = new ArrayList<>(Arrays.asList(sortedStudentsArray));
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
        sortStudents();
    }

    public void removeStudent(String studentName) throws StudentNotFoundException {
        students.remove(findStudent(studentName));
    }

    public Student findStudent(String studentName) throws StudentNotFoundException {
        Student studentToFind = new Student(studentName, 0, 0);
        int leftIndex = 0;
        int rightIndex = students.size() - 1;

        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            Student currentStudent = students.get(middleIndex);

            if (studentToFind.compareTo(currentStudent) == 0) {
                return currentStudent;
            }

            if (studentToFind.compareTo(currentStudent) < 0) {
                rightIndex = middleIndex - 1;
            } else {
                leftIndex = middleIndex + 1;
            }
        }

        throw new StudentNotFoundException(studentName);
    }
}
