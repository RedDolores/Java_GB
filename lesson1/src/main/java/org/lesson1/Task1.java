//Вычислить n-ое треугольного число (сумма чисел от 1 до n),
//n! (произведение чисел от 1 до n)

package org.lesson1;

import java.util.Scanner;

public class Task1 {
    private static int getIntNum() {
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.next();
        return Integer.parseInt(enter);
    }

    public void triangualNumber() {
        System.out.print("Введите n треугольного числа: ");
        int sumNum = 0;
        try {
            int number = getIntNum();
            for (int i = 1; i <= number; i++) {
                sumNum += i;
            }
            System.out.println(sumNum);
        } catch (NumberFormatException ex) {
            System.out.println("На вход ожидалось число. Повторите попытку.");
            triangualNumber();
        }

    }

    public void factorial() {
        System.out.print("Введите число n!: ");
        int fNum = 1;
        try {
            int number = getIntNum();
            if (number < 1) throw new Exception();
            for (int i = 1; i <= number; i++) {
                fNum *= i;
            }
            System.out.println(fNum);
        } catch (NumberFormatException ex) {
            System.out.println("На вход ожидалось число. Повторите попытку.");
            factorial();
        } catch (Exception ex) {
            System.out.println("Число должно быть больше 1. " +
                    "Повторите попытку.");
            factorial();
        }

    }
}
