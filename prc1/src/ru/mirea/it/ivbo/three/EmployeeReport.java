package ru.mirea.it.ivbo.three;

import java.text.DecimalFormat;
class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, int salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getFullname() {
        return fullname;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет о сотрудниках:");

        System.out.println("--------------------------------------");
        System.out.println("ФИО сотрудника           | Зарплата");
        System.out.println("--------------------------------------");

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        for (Employee employee : employees) {
            String formattedSalary = decimalFormat.format(employee.getSalary());
            System.out.printf("%-25s | %10s%n", employee.getFullname(), formattedSalary);
        }

        System.out.println("--------------------------------------");
    }
}

public class EmployeeReport {
    public static void main(String[] args) {
        Employee[] employees = {
        new Employee("Givanchy", 12330),
        new Employee("Henderson", 23421),
        new Employee("Helena", 23322) };

        Report.generateReport(employees);

    }
}
