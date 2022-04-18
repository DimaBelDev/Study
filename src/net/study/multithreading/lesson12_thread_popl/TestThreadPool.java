package net.study.multithreading.lesson12_thread_popl;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(5); // создает пул потоков
        threadPool.submit(() -> {for(int i = 0;i < 10000;i++){ // передаем Runnable
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }});

        threadPool.shutdown(); // выполнив все задания он прекращает работать
                               // если не вызвать никогда не прекратит
        threadPool.awaitTermination(3, TimeUnit.SECONDS); // либо успевает выполнить задания
                                                                 // либо прервется через 3 секунды

    }
}
