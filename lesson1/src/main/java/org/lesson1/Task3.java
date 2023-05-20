//Реализовать простой калькулятор

package org.lesson1;


import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static double getDoubleNum() {
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.next();
        return Double.parseDouble(enter);
    }

    public void calculator() {
        String[] op = new String[]{"+", "-", "*", "/", "0"};
        try {
            System.out.print("Введите операцию (+ , - , * , /): " +
                    "или 0 для выхода. ");
            Scanner scanner = new Scanner(System.in);
            String operator = scanner.next();
            if (!Arrays.asList(op).contains(operator)) throw new Exception();
            else if (operator.equals("0")) {
                return;
            }
            System.out.print("Введите число a: ");
            double a = getDoubleNum();
            System.out.print("Введите число b: ");
            double b = getDoubleNum();

            switch (operator) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    if (b == 0) throw new ArithmeticException();
                    System.out.println(a / b);
                    break;
            }
        } catch (NumberFormatException ex) {
            System.out.println("На вход ожидалось число. Повторите попытку.");
            calculator();
        } catch (ArithmeticException ex) {
            System.out.println("Деление на 0 запрещено. Повторите попытку.");
            calculator();
        } catch (Exception ex) {
            System.out.println("Оператор введен некорректно. " +
                    "Повторите попытку.");
            calculator();

        }
    }

}

