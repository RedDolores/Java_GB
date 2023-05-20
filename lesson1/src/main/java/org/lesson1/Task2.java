//Вывести все простые числа от 1 до 1000

package org.lesson1;

import java.util.Scanner;

public class Task2 {
    private static int getIntNum() {
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.next();
        return Integer.parseInt(enter);

    }

    public void primeNumber() {
        System.out.print("Введите n для нахождения простых чисел: ");
        try {
            int number = getIntNum();
            if (number < 2) throw new Exception();
            System.out.printf("%d ", 2);
            for (int i = 3; i < number + 1; i += 2) {
                int flag = 1;
                for (int j = 2; j < i / 2; j++) {
                    if (i % j == 0) {
                        flag = 0;
                    }
                }
                if (flag == 1) {
                    System.out.printf("%d ", i);
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("На вход ожидалось число. Повторите попытку.");
            primeNumber();
        } catch (Exception ex) {
            System.out.println("Минимальное простое число - 2. " +
                    "Повторите попытку.");
            primeNumber();
        }
    }
}
