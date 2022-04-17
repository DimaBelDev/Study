package net.study.multithreading.lesson4_volatile;


public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(3000);
        System.out.println("Start main");
        myThread.setCheck(false); // (без volatile) кэшируется в потоке main и не передает в main memory чтобы myThread вязл новое значение
        myThread.join();
        System.out.println("End thread");

    }
}

class MyThread extends Thread{
    volatile boolean check = true;   // volatile если переменная принадлежит одному потоку
                                     // ,а изменяем мы ее в другом ,то нужно помечать этим словом.
    int a = 0;                       // но изменять должен только один поток а читать неограниченное кол-во иначе гонка
    @Override
    public void run() {
        while (check){
            a++;
        }
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}


