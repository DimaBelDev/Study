package net.study.multithreading.lesson1_creat;

public class TestCreat {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int a = 0; a < 1001; a++) {
                System.out.println(a);
            }
        });
        MyThread thread1 = new MyThread();
        Thread thread2 = new Thread(new MyThreadTwo());

        thread.start();
        thread1.start();
        thread2.start();

    }


}


class MyThread extends Thread{
    @Override
    public void run() {
        for(int a = 0; a < 1001; a++){
            System.out.println(a);
        }
    }
}
class MyThreadTwo implements Runnable{

    @Override
    public void run() {
        for(int a = 0; a < 1001; a++){
            System.out.println(a);
        }
    }
}
