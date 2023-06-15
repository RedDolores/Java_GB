package org.example;

import java.util.Scanner;

public class Task1 {
    public void enterFloat() {
        System.out.println("Enter float: ");
        Scanner scanner = new Scanner(System.in);

        try {
            Float enter = Float.valueOf(scanner.next());
            System.out.println(enter);
        } catch (NumberFormatException e) {
            System.out.println("Not float. Try again: ");
            enterFloat();
        }

    }
}
