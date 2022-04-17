package net.study.multithreading.lesson3_sleep_join;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        MyTread myTread = new MyTread();
        myTread.start();
        myTread.join(); // поток main будет ждать пока поток myTread не будет выполнен
        // myTread.join(4000); либо поток успевает закончить работу за 4 сек либо после запустится поток main

        // Thread.sleep(4000); // поток main ожидает 4 сек

        for(int a = 0; a < 100; a++){
            System.out.println(Thread.currentThread().getName() + " "  + a);
        }
    }
}

class MyTread extends Thread{
    @Override
    public void run() {
        System.out.println("start thread " + Thread.currentThread().getName());
        for(int a = 0; a < 1000;a++){
            System.out.println(Thread.currentThread().getName() + " : " + a);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Finis " + Thread.currentThread().getName());
    }
}
