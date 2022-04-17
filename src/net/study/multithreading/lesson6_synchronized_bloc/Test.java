package net.study.multithreading.lesson6_synchronized_bloc;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> new Call().callByMobile());
        Thread thread2 = new Thread(() -> new Call().callByViber());
        Thread thread3 = new Thread(() -> new Call().callByWhatsAap());

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();



    }
}
class Call{
    private static final Object lock = new Object();

    void callByMobile(){
    synchronized (lock){
        System.out.println("start mobile");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end mobile");
    }
    }
    void callByWhatsAap(){
        synchronized (lock){
            System.out.println("start whatsapp");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end whatsapp");
        }
    }
    void callByViber(){
        synchronized (lock) {
            System.out.println("start viber");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end viber");
        }
    }


}