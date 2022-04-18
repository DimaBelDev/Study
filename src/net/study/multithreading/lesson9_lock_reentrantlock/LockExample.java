package net.study.multithreading.lesson9_lock_reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> new Call().mobileCall());
        Thread thread2 = new Thread(() -> new Call().viberCall());
        Thread thread3 = new Thread(() -> new Call().whatsAapCall());

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
class Call{
    private final static Lock lock = new ReentrantLock();

    public synchronized void viberCall(){
        try {
            lock.lock();
            System.out.println("End viber call");
            System.out.println("Start viber call");
        }finally {
            lock.unlock();
        }

    }

    public synchronized void mobileCall(){
           try {
            lock.lock();
            System.out.println("Start mobile call");
            System.out.println("End mobile call");
        }finally {
        lock.unlock();
           }
      }
    public synchronized void whatsAapCall(){
            try {
                lock.lock();
                System.out.println("Start whatsapp call");
                System.out.println("End whatsapp call");
            }finally {
                lock.unlock();
            }
    }

}
