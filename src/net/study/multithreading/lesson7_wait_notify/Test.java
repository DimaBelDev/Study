package net.study.multithreading.lesson7_wait_notify;



public class Test {
    public static void main(String[] args) throws InterruptedException {
        Market market = new Market();
     Producer producer = new Producer(market);
     Consumer consumer = new Consumer(market);

     Thread thread1 = new Thread(producer);
     Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}

class Market{
    public static volatile int countBread = 0;

    public synchronized void creatBread(){
            while (countBread >= 5) {
                try {
                    wait(); // отдаем монитор и ждем вызова notify
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            countBread++;
            System.out.println("Создан хлеб");
            System.out.println("Количество хлеба : " + countBread);
            notify();
    }
    public synchronized void buyBread() {
            while (countBread < 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            countBread--;
            System.out.println("Хлеб куплен");
            System.out.println("Количество хлеба : " + countBread);
            notify(); // снимаем блокировку с wait(); который в creatBread() при этом монитор может остаться идет борьба потоков
     }
}
class Producer implements Runnable{
    private Market market;
    Producer(Market market){
        this.market = market;
    }
    @Override
    public void run() {
        for(int i = 0; i < 100;i++)
        market.creatBread();
    }
}
class Consumer implements Runnable{
    private Market market;
    Consumer(Market market){
        this.market = market;
    }
    @Override
    public void run() {
        for(int i = 0; i < 100;i++)
         market.buyBread();
    }
}
