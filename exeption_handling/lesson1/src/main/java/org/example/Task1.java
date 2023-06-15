package org.example;

import java.util.Scanner;

public class Task1 {


    // ArithmeticException
    public void div(){
        System.out.println(2/0);
    }

    // NumberFormatException при вводе строки
    public void enterValue(){
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.next();
        int i = Integer.parseInt(enter);
        System.out.println(i);
    }

    // ArrayIndexOutOfBoundsException
    public void getElement(){
        int[] ints = new int[10];
        System.out.println(ints[11]);
    }
}
