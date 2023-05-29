package org.lesson3;


import java.util.List;


public class Main {
    public static void main(String[] args) {

        Task task1 = new Task();
        List<Integer> ints = task1.fillRandomList();
        System.out.println(ints);
        task1.removeAllEvenNumbers(ints);
        task1.getMin(ints);
        task1.getMax(ints);
        task1.getAverage(ints);

    }
}