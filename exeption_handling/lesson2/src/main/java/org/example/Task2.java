package org.example;

public class Task2 {

    public void a(){

        try {
            int d = 0;
            int[] intArray = new int[10];
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Catching exception: " + e);
        }

    }
}
