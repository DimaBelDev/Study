package net.study.multithreading.lesson14_callable;

import java.util.concurrent.*;

public class Test {
    static int result;
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

       Future<Integer> future =  executorService.submit(new Factorial(5));

        try {
            result = future.get();
            System.out.println(result);
        } catch (ExecutionException e) {
            e.getCause();
        }finally {
            executorService.shutdown();
        }

    }
}
class Factorial implements Callable<Integer>{ // возвращает значение
    private final int factorial;
    private int resultFactorial = 1;

    Factorial(int factorial){
        this.factorial = factorial;
    }

    @Override
    public Integer call() throws Exception {
        if(factorial < 1){
            throw new Exception("You have written wrong number");
        }
        for(int i = 1; i <= factorial;i++){
            resultFactorial*=i;
        }
        return resultFactorial;
    }
}
