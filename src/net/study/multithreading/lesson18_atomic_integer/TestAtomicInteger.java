package net.study.multithreading.lesson18_atomic_integer;

import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomicInteger {

    static AtomicInteger counter = new AtomicInteger(0); // все медоты являются атомарными поэтому синхронизация не нужна

    public static void increment(){
        counter.incrementAndGet(); //не нужно синхронизировать все методы являются атомарными
        // counter.addAndGet(5); добавляем 5 и получаем
        // counter.getAndAdd(5); получаем а потом добавляем
        // counter.getAndDecrement(); получаем а потом уменьшаеи и есть метод все наоборот
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("counter = " + counter.get());


    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 100;i++)
        TestAtomicInteger.increment();
    }
}
