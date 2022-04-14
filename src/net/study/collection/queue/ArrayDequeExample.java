package net.study.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    // реализует как (First in First out),  так и (First in Last out)

    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.addFirst(8); // добавление в начало
        arrayDeque.add(100);
        arrayDeque.addLast(1); // добавление в конец
        arrayDeque.add(101);
        arrayDeque.addFirst(12);
        arrayDeque.offerFirst( 2); // без выбрасывания ошибки
        System.out.println(arrayDeque.removeFirst()); // c ошибкой
        System.out.println(arrayDeque.pollLast()); // без ошибок
        System.out.println(arrayDeque.getFirst()); // с ошибкой
        System.out.println(arrayDeque.peekFirst()); // без ошибки
        // arrayDeque.add(null); нельзя добавлять
        // arrayDeque.offerFirst(null); нельзя

        System.out.println(arrayDeque);
    }
}
