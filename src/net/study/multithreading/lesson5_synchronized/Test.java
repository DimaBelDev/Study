package net.study.multithreading.lesson5_synchronized;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();



    }
}
class Increment{
    private volatile static int count = 0;
  public static synchronized void increment(){
      count++;
      System.out.println(count);
  }
}

class R implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 1000;i++)
       Increment.increment();
    }
}
