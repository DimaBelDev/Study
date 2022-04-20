package net.study.multithreading.lesson16_count_down_latch;

import java.util.concurrent.CountDownLatch;

public class TestCountDownLatch {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        Marker marker = new Marker(countDownLatch);
        marker.cleaning();
        marker.displayOfGoods();
        MyThread myThread = new MyThread(marker);


    }
}

class Marker {
    private CountDownLatch countDownLatch;

    public Marker(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public void displayOfGoods(){
        countDownLatch.countDown();
        System.out.println("Отщелкнулся");
    }

    public void cleaning(){
     countDownLatch.countDown();
        System.out.println("Отщелкнулся");
    }

    public void start() throws InterruptedException {
        countDownLatch.await(); // ждет когда countDownLatch.countDown() будет вызван столько раз сколько указано при создании объекта CountDownLatch
        System.out.println("Поехали");
    }
}
class MyThread extends Thread{
    private Marker marker;

    MyThread(Marker marker){
        this.marker = marker;
        this.start();
    }

    @Override
    public void run() {
        try {
            marker.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
