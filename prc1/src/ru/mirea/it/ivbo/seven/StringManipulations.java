package ru.mirea.it.ivbo.seven;

interface WorkWithStrings {
    int countSymbols(String s);
    String oddPositionsString(String s);
    String reverseString(String s);
}

class StringManipulator implements WorkWithStrings {
    public int countSymbols(String s) {
        return s.length();
    }
    public String oddPositionsString(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }

        return result.toString();
    }

    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
public class StringManipulations {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();

        String current = "wow,that's so cool!";
        System.out.println("Строка содержит " + manipulator.countSymbols(current) + " символов");
        System.out.println("Строка наоборот: " + manipulator.reverseString(current));
        System.out.println("Строка из нечетных символов: " + manipulator.oddPositionsString(current));
    }
}
