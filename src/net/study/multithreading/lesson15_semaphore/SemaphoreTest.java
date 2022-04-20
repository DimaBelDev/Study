package net.study.multithreading.lesson15_semaphore;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(2); // в одно время только указанное кол-во потоков имеют доступ к ресурсу
        new Call(semaphore, "Dima");
        new Call(semaphore, "Vika");
        new Call(semaphore, "Igor");
        new Call(semaphore, "Denis");
        new Call(semaphore, "Lexa");
        new Call(semaphore, "Valera");
    }
}
class Call extends Thread{
        private Semaphore semaphore;
        private String name;
          Call(Semaphore semaphore, String name){
               this.semaphore = semaphore;
               this.name = name;
               this.start();
          }

          public void speaking() throws InterruptedException {
                  try {
                          System.out.println("Ждет " + name);
                          semaphore.acquire(); // блокирует все остальные потоки если их больше чем указано
                          System.out.println("Делает звонок " + name);
                          sleep(2000);
                      System.out.println("Закончил звонок " + name);
                  } finally {
                          semaphore.release(); // освобождает место
                  }
          }

        @Override
        public void run() {
                try {
                        speaking();
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
        }
}
