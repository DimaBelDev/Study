package net.study.collection.thread_safe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1SynchronizedCollection {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> source = new ArrayList<>(List.of(0,1,2,3,4));

        //ArrayList<Integer> target = new ArrayList<>(); // не синхронизированная коллекция, результат не предсказуем
        List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>()); // использует Lock
        Runnable runnable = () -> synchronizedList.addAll(source);

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(synchronizedList);
    }
}
