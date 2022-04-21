package net.study.collection.thread_safe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test2SynchronizedCollection {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        List<Integer> synchronizedList = Collections.synchronizedList(list);

        Runnable runnable1 = () -> {
            synchronized (synchronizedList) { // нужно в этом случае синхронизироваться так как итератор не потоко безопасный
                Iterator<Integer> iterator = synchronizedList.iterator(); // и в случае если он не успел закончить вывод, а элемент удалился
                while (iterator.hasNext()) {                             // то все элементы смищаются и он не успевает и он не знает что делать
                    System.out.println(iterator.next());
                }
            }
        };


        Runnable runnable = () -> {synchronizedList.remove(10);};

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable1);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.print(synchronizedList);

    }
}
