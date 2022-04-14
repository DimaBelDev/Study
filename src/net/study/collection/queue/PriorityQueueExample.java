package net.study.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
     // Сортирует элементы по возрастанию
     // Если работаем с объектам обязательно переопределять COMPARABLE ИЛИ COMPARATOR
     // все остально так же как и в Queue LinkedList

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(3);
        priorityQueue.offer(6);
        priorityQueue.offer(1);
        priorityQueue.offer(9);
        priorityQueue.offer(2);

        System.out.println(priorityQueue); // может выводить не по возрастаню, но это ничего не значит(они отсортированы)

        System.out.println(priorityQueue.poll()); // удалит 1
        System.out.println(priorityQueue.poll()); // удалит 2
        System.out.println(priorityQueue.poll()); // удалит 3
        System.out.println(priorityQueue.poll()); // удалит 6
        System.out.println(priorityQueue.poll()); // удалит 9







    }
}
