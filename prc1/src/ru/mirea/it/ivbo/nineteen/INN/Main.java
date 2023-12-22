package ru.mirea.it.ivbo.nineteen.INN;

import ru.mirea.it.ivbo.nineteen.INN.InnException;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static boolean isInnCorrect(String INN){
        if(INN.length()!=12)
            return false;
        return Pattern.matches("\\d{12}", INN);
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Full name: ");
        String fullName = scanner.nextLine();
        System.out.print("INN: ");
            String INN = scanner.next();
            if (!isInnCorrect(INN))
                throw new InnException(INN);
            else System.out.println("Order was made");
//        }catch (InnException e){
//            System.out.println(e.getMessage());
//        }
    }
}