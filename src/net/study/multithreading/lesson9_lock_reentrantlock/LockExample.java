package net.study.multithreading.lesson9_lock_reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {
        // final Lock lock  = new ReentrantLock();
        Thread thread1 = new Thread(() -> new Call().mobileCall());
        Thread thread2 = new Thread(() -> new Call().viberCall());
        Thread thread3 = new Thread(() -> new Call().whatsAapCall());

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
class Call{

//    private Lock lock;
//
//    public Call(Lock lock) {
//        this.lock = lock;
//    }
    private static final Lock lock = new ReentrantLock(); // принцип как у synchronized

    public  void viberCall(){
        try {
            lock.lock();
            System.out.println("Start viber call");
            Thread.sleep(100);
            System.out.println("End viber call");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void mobileCall(){
           try {
            lock.lock();
            System.out.println("Start mobile call");
            Thread.sleep(100);
            System.out.println("End mobile call");
        } catch (InterruptedException e) {
               e.printStackTrace();
           } finally {
        lock.unlock();
           }
      }
    public void whatsAapCall(){
            try {
                lock.lock();
                System.out.println("Start whatsapp call");
                Thread.sleep(100);
                System.out.println("End whatsapp call");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
    }

}
