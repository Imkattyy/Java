package ru.mirea.it.ivbo.thirteen;

import java.util.Scanner;

// Обрабатывает строку "I like Java!!!"
public class Sentence {
    public static void method(String line) {
        System.out.println(line.charAt(line.length() - 1));
        if (line.endsWith("!!!"))
            System.out.println("end with \"!!!\"");
        if (line.startsWith("I like"))
            System.out.println("start with \"I like\"");
        if (line.contains("Java"))
            System.out.println("contains \"Java\"");
        System.out.println("\"Java\" index: [" + (line.indexOf("Java") + 1) + ", " + (line.indexOf("Java") + 4) + "]");
        System.out.println(line.replace("a", "o"));
        System.out.println(line.toUpperCase());
        System.out.println(line.toLowerCase());
        if (line.contains("Java"))
            line = line.substring(0,line.indexOf("Java")) + line.substring(line.indexOf("Java")+4);
        System.out.println(line);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        method(line);
    }
}
