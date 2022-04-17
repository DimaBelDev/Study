package net.study.multithreading.lesson8_deadlock;

public class Test {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> DeadLock.methodOne());
        Thread thread2 = new Thread(() -> DeadLock.methodTwo());

        thread1.start();
        thread2.start();

    }
}

class DeadLock{

    public static void methodOne(){
        System.out.println("Попытка захватить lock1");
        synchronized (Test.lock1){          // возможна такая ситуация что lock1 будет захвачен в одном потоке ,
            System.out.println("lock1 захвачен"); // а в другом потоке lock2 и методы никогда не будут выполнены
            System.out.println("Попытка захватить lock2");
            synchronized (Test.lock2){
                System.out.println("lock2 захвачен");
            }
        }
    }
    public static void methodTwo(){
        System.out.println("Попытка захватить lock2");
        synchronized (Test.lock2){
            System.out.println("lock2 захвачен");
            System.out.println("Попытка захватить lock1");
            synchronized (Test.lock1){
                System.out.println("lock1 захвачен");

            }
        }
    }


}
