package net.study.multithreading.lesson9_lock_reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        ATM thread1 = new ATM("Dima",lock);
        ATM thread2 = new ATM("Sasha",lock);
        ATM thread3 = new ATM("Vika",lock);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class ATM extends Thread{
    private String name;
    private  Lock lock; // работает по принцепу synchronized

    public ATM(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {

        try {
            System.out.println("Ожидает " + name);
            lock.lock();
            System.out.println("Приступил к работе с банкоматом " + name);
            Thread.sleep(3000);
            System.out.println("Закончил работу " + name);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}