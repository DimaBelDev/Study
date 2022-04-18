package net.study.multithreading.lesson11_stop_thread;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        System.out.println("main starts");
        myThread.start();
        Thread.sleep(3000);
        myThread.interrupt(); // говорим что хотим прервать поток
        myThread.join();
        System.out.println("main ends");
    }

}


class MyThread extends Thread{

    @Override
    public void run() {
    for(int i = 0; i < 1000000;i++) {

        if(isInterrupted()) { // ловим и меняем на true
            System.out.println("поток хотят прервать");
            System.out.println("поток прерван");
            return; // завершаем заботу, или что-то делам другое
        }

        try {
            sleep(100); // если указал сон для потоко и хотим прервать поток то выбросится исключение
        } catch (InterruptedException e) {
            System.out.println("поток хотят прервать во время сна ");
            return; // выход из потока
        }
        System.out.println(i);

        }
    }
}