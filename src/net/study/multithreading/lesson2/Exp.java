package net.study.multithreading.lesson2;

public class Exp {
    public static void main(String[] args) {

        Thread thread = new Thread(new MyThread());

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        thread.setPriority(Thread.MIN_PRIORITY); // если зададим разные приоритеты потоки не будут пересекаться(ВРОДЕ)
        thread.setName("my thread"); // МОЖЕМ  ИЗМЕНИТЬ НАЗВАНИЕ(ПО ДЕФОЛТУ Thread, Thread-1 и т.д. )
        thread.getName();
        thread.getPriority();
        thread.start();

        for(int a = 0; a < 1000; a++){
            System.out.println(a);
        }

    }
}
class MyThread implements Runnable{

    @Override
    public void run() {
        //System.out.println(Thread.currentThread().getName()); // Возвращает объект Thread в потоке
        for(int a = 0; a < 1000; a++){
            System.out.println(a + " " + Thread.currentThread().getName());
        }
    }
}