package net.study.collection.thread_safe;

import java.util.concurrent.ArrayBlockingQueue;

public class TestArrayBloсkingQueue {
    // потокобезопасная очередь с ограниченным размером
    public static void main(String[] args) {
        // принцип работы FIFO
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(10); // ограничивает количество элементов

       // arrayBlockingQueue.add(); // если нет свободных мест выбрасывает ошибку
       // arrayBlockingQueue.offer(); // если нет свободных мест пропускает
       // arrayBlockingQueue.put(); // если нет свободных мест ожидает, забирать при помощи take(если нет элементов он ожидает)


        //Producer
        Thread producer = new Thread(() -> {
            int counter = 0;
            while (true) {
                try {
                    System.out.println("Added element " + ++counter);
                    arrayBlockingQueue.put(counter); // ложит если нет свободных мест ожидает
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {

            while (true){
                try {
                    int tookElement = arrayBlockingQueue.take();
                    System.out.println("Took element " + tookElement);
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        producer.start();
        consumer.start();
    }
}
