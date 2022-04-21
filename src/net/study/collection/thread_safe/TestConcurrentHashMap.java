package net.study.collection.thread_safe;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class TestConcurrentHashMap {
    public static void main(String[] args) throws InterruptedException {

        ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>(); // потоко безопасный
        hashMap.put(1,"Vika");
        hashMap.put(2,"Serega");
        hashMap.put(3,"Sasha");
        hashMap.put(4,"Denis");
        System.out.println(hashMap);
        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = hashMap.keySet().iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(iterator.next());
            }
        };
        Runnable runnable2 = () -> {
            try {
                Thread.sleep(2500);
                hashMap.put(5, "Dima");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(hashMap);

    }
}
