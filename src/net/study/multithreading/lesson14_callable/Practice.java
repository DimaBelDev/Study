package net.study.multithreading.lesson14_callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Practice {
    static long result;
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
    long number = 1_000_000_000;
    List<Future<Long>> listFuture = new ArrayList<>();
    long temp = number/10;
    for(int i = 0; i < 10;i++){
        long from = temp * i + 1;
        long to = temp * (i + 1);
        listFuture.add(service.submit(new PartialSum(from, to)));
    }
    for(int i = 0; i < listFuture.size(); i++){
        try {
            result +=listFuture.get(i).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
    service.shutdown();

        System.out.println(result);

    }
}

class PartialSum implements Callable<Long> {
    long from;
    long to;
    long result;

    PartialSum(long from, long to){
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() throws Exception {
        for(long i = from; i <= to;i++){
            result += i;
        }
        return result;
    }
}
