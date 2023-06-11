//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
// вернет “перевернутый” список.
//Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.



package org.lesson4;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new LinkedList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);

        System.out.println("Исходный: " + ints);
        Collections.reverse(ints);
        System.out.println("Итоговый: " + ints);

        Task1 task1 = new Task1();

        task1.enqueue((LinkedList<Integer>) ints, 4);
        System.out.println(ints);

//        int dequeueElements = task1.dequeue((LinkedList<Integer>) ints);
        System.out.println(task1.dequeue((LinkedList<Integer>) ints));
        System.out.println(ints);

//        int firstElement = task1.first((LinkedList<Integer>) ints);
        System.out.println(task1.first((LinkedList<Integer>) ints));
        System.out.println(ints);

        
    }
}