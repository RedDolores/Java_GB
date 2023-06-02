//Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

package org.lesson3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task {

    public List<Integer> fillRandomList() {

        List<Integer> ints = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            ints.add(random.nextInt(100));
        }
        return ints;

    }

    public void removeAllEvenNumbers(List<Integer> ints) {

        if (ints == null || ints.size() == 0) {
            System.out.println("List is empty.");
        } else {
            for (int i = ints.size() - 1; i >= 0; i--) {

                if (ints.get(i) % 2 == 0) ints.remove(ints.get(i));
            }
            System.out.println(ints);
        }

    }

    public void getMin(List<Integer> ints) {

        if (ints == null || ints.size() == 0) {
            System.out.println("List is empty.");
        } else {
            System.out.println(Collections.min(ints));
        }
    }

    public void getMax(List<Integer> ints) {

        if (ints == null || ints.size() == 0) {
            System.out.println("List is empty.");
        } else {
            System.out.println(Collections.max(ints));
        }
    }

    public void getAverage(List<Integer> ints) {

        System.out.println(ints.stream().mapToInt(a -> a)
                .average().orElse(0));

    }

}
