//Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.



package org.lesson4;

import java.util.LinkedList;
import java.util.List;

public class Task1 {

    public void enqueue(LinkedList<Integer> ll, int x){
            ll.addLast(x);
    }

    public int dequeue(LinkedList<Integer> ll){
        return ll.removeFirst();
    }

    public int first(LinkedList<Integer> ll){
        return ll.getFirst();
    }

}
