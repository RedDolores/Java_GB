package org.example;

public class Task3 {

    public void divArray(int[] arr1, int[] arr2) {

        try {
            if (arr1.length == arr2.length) {
                int[] sumArr = new int[arr1.length];
                for (int i = 0; i < arr1.length; i++) {
                    if (arr2[i] == 0) {
                        throw new RuntimeException();
                    } else {
                        sumArr[i] = arr1[i] / arr2[i];
                    }
                }
                for (int i = 0; i < sumArr.length; i++) {
                    System.out.println(sumArr[i]);
                }
            } else {
                throw new ArithmeticException();
            }

        } catch (ArithmeticException e) {
            System.err.println("Массивы разной длины.");
        } catch (RuntimeException e) {
            System.err.println("Деление на ноль.");
        }

    }
}



