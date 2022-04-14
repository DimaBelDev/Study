package net.study.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> queueLinkedList = new LinkedList<>();

        // queueLinkedList.add("Dima");//Если очередь ограничена кол-во элементов, то выбросит ошибку если привысим кол-во
          queueLinkedList.offer("Dima"); // не выбросит ошибку, просто не добавит элемент
          queueLinkedList.offer("Slava");
          queueLinkedList.offer("Sasha");
          queueLinkedList.offer("Lida");
          queueLinkedList.offer("Maryna");

        //queueLinkedList.remove(); // если очередь пуста и буду стараться удалить несуществующий элемент выбросит ошибку
        System.out.println("Удалил " + queueLinkedList.poll()); // не выброси ошибку при удалении а вернет null
           // queueLinkedList.element(); //показывает верхний элемент(первый добавленный и так далее), если элементов нет выбросит ошибку
        System.out.println("Первый элемент " + queueLinkedList.peek()); // не выбросит ошибку, а вернет null

    }
}
