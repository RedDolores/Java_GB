package org.example;

import java.util.Scanner;

public class Task4 {
    public void enterValue(){
        System.out.println("Enter value: ");
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.next();
        if(enter == null){
            System.err.println("!");
        }
        System.out.println("Enter: " + enter);

    }
}
