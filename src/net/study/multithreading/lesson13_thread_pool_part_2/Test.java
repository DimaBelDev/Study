package net.study.multithreading.lesson13_thread_pool_part_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        // применяется когда нужно какое-то расписание запуска потоков
        ScheduledExecutorService threadPool =
                Executors.newScheduledThreadPool(1);

//        for(int i = 0; i < 10;i++){
//            threadPool.execute(new MyRunnableImp()); // просто выполняет без расписания
//        }
//        threadPool.schedule(new MyRunnableImp(), 5, TimeUnit.SECONDS);// через 5 секунд начнется выполнение
//        threadPool.shutdown(); //  после выполнения задания завершает поток

//          threadPool.scheduleAtFixedRate(new MyRunnableImp(), 3, 1, TimeUnit.SECONDS);
//          // задание впервые выполнится через 3 секунды, а затем будет выполнятся с периодичность в 1 секунду
//          // не между выполнениями задач переодичность 1 секунда, а на выпонение задачи 1 секундку
//          // если задача выполняется долже то следующая задача срабатывает сразу
//          // если будет вызван метод shutdown() то поток сразу завершится
//          Thread.sleep(20000);
//          threadPool.shutdown();

        threadPool.scheduleWithFixedDelay(new MyRunnableImp(), 3, 1, TimeUnit.SECONDS);
        // задание впервые выполнится через 3 секунды, а затем будет выполнятся с периодичность в 1 секунду
        // делается пауза МЕЖДУ задачами в 1 секунду
        Thread.sleep(20000);
        threadPool.shutdown();


        ExecutorService executorService = Executors.newCachedThreadPool();
        // СОЗДАЕТ ПОТОКИ ПО НАДОБНОСТИ И УДАЛЕТ ЧЕРЕЗ 60 СЕКУНД ЕСЛИ КАКОЙ-ТО ИЗ НИХ НЕ ИСПОЛЬЗУЕТСЯ

    }
}

class MyRunnableImp implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begin work");

        System.out.println(Thread.currentThread().getName() + " finish work");
    }
}
