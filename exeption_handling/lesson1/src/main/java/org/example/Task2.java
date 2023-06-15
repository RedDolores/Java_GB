package org.example;

public class Task2 {

    public void sumArray(int[] arr1, int[] arr2) {

        if (arr1.length == arr2.length) {
            int[] sumArr = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                sumArr[i] = arr1[i] + arr2[i];
            }
            for (int i = 0; i < sumArr.length; i++) {
                System.out.println(sumArr[i]);
            }
        } else {
            System.err.println("Массивы разной длины.");
        }

    }
}
