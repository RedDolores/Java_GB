package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task4 {
    private static Logger logger = Log.log(Task4.class.getName());

    private static double getDoubleNum() {
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.next();
        return Double.parseDouble(enter);
    }

    public void calculator() {
        String[] op = new String[]{"+", "-", "*", "/", "0"};
        try {
            logger.log(Level.INFO,"Введите операцию (+ , - , * , /) " +
                    "или 0 для выхода: ");
            Scanner scanner = new Scanner(System.in);
            String operator = scanner.next();


            if (!Arrays.asList(op).contains(operator)) throw new Exception();
            else if (operator.equals("0")) {
                return;
            }
            logger.log(Level.INFO,"Введите число a: ");
            double a = getDoubleNum();
            logger.log(Level.INFO,"Введите число b: ");
            double b = getDoubleNum();

            switch (operator) {
                case "+":
                    logger.log(Level.INFO, "Result: " +
                            String.valueOf(a + b));
                    break;
                case "-":
                    logger.log(Level.INFO, "Result: " +
                            String.valueOf(a - b));
                    break;
                case "*":
                    logger.log(Level.INFO, "Result: " +
                            String.valueOf(a * b));
                    break;
                case "/":
                    if (b == 0) throw new ArithmeticException();
                    logger.log(Level.INFO, "Result: " +
                            String.valueOf(a / b));
                    break;
            }
//            logger.log(Level.INFO, "Пользователь ввел operator: "
//                    + operator);
//            logger.log(Level.INFO, "Пользователь ввел a: " + a);
//            logger.log(Level.INFO, "Пользователь ввел b: " + b);

        } catch (NumberFormatException ex) {
            logger.log(Level.INFO, "На вход ожидалось число. " +
                    "Повторите попытку.");
            calculator();
        } catch (ArithmeticException ex) {
            logger.log(Level.INFO, "Деление на 0 запрещено. " +
                    "Повторите попытку.");
            calculator();
        } catch (Exception ex) {
            logger.log(Level.INFO, "Оператор введен некорректно. " +
                    "Повторите попытку.");
            calculator();

        }
    }
}
