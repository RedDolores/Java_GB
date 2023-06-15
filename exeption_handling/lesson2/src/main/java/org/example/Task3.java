package org.example;


public class Task3 {
    public static void main(String[] args) throws Exception {

        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.err.println("Указатель не может указывать на null! " + ex);
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Массив выходит за пределы своего размера! " + ex);
        } catch (ArithmeticException ex) {
            System.err.println("Деление на ноль.");
        } catch (Throwable ex) {
            System.err.println("Что-то пошло не так... " + ex);
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
