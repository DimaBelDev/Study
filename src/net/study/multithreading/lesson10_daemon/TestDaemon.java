package net.study.multithreading.lesson10_daemon;

public class TestDaemon {
    public static void main(String[] args) throws InterruptedException {
        // поток Daemon это фоновый поток если заканчивают свою работу все потоки то и поток Daemon
        // вне зависимость от того закончил ли он выполнять свой функционал прекращает работу
        Thread thread1 = new Thread(new MyThreadOne());
        thread1.setDaemon(true); // помечаем что этот поток является Daemon
        Thread thread2 = new Thread(new MyThreadTwo());

        thread1.start();
        thread2.start();

        //thread1.join(); // поток Daemon не помечать join иначе теряет свой смысл
        thread2.join();

    }
}

class MyThreadOne implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i <  1000;i++){
            System.out.println(i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyThreadTwo implements Runnable{


    @Override
    public void run() {
        for(char i = 'A'; i < 'V';i++){
            System.out.println(i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}